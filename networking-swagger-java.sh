#! /bin/sh
""":"
exec python $0 ${1+"$@"}
"""

import os
import sys
import re
import urllib2
import ssl
import shutil


#1.0.0
#networking-swagger-java -url -package -serviceName -resultJsonKey
#retro -parser classes
class Interval:
    start = -1
    end = -1
    def __init__(self):
        pass



apiRegex = re.compile(r'@(POST|GET)\(\"(.*?)\"\)')
class Api:

    method = None
    address= None

    def __init__(self):
        pass

    @staticmethod
    def parse(raw):
        api = Api()
        api.method = re.findall(apiRegex, raw)[0][0]
        api.address = re.findall(apiRegex, raw)[0][1]

        return api

headerRegex = re.compile(r'@Headers\({\"(.*?)\"}\)')
class Header:

    name = None
    value = None

    @classmethod
    def __init__(self, name, value):
        self.name = name
        self.value = value

    @staticmethod
    def has(raw):
        return len(re.findall(headerRegex, raw)) > 0

    @staticmethod
    def parse(raw):
        headers = []
        contents = re.findall(headerRegex, raw)[0].split(",")

        for content in contents:
            splits = content.split(":")

            header = Header(splits[0], splits[1])
            headers.append(header)

        return headers




parameterRegex = re.compile(
    r'@retrofit2.http.(Query|Path|Body)\(?\"?(.*?)\"?\)? (.*?) (.*?),? ')
class Parameter:

    # Represents annotation is query, path or body
    annotation = None

    # Represents annotations key like @Query("_key_")
    key = ''

    # Represents parameter name
    name = None

    # Represents parameter class type
    clazz = None

    def __init__(self):
        pass

    @staticmethod
    def has(raw):
        return r'@retrofit2' in raw

    @staticmethod
    def parse(params):
        parameters = []

        matches = re.findall(parameterRegex, params)
        for match in matches:
            parameter = Parameter()
            parameter.annotation = match[0]
            parameter.key = match[1] if match[1] is not '' else None
            parameter.clazz = match[2]
            parameter.name = match[3]

            parameters.append(parameter)

        return parameters

class Function:

    name = None
    api = None
    headers = []
    response = None
    parameters = []

    def __init__(self):
        pass

    @staticmethod
    def parse(content):
        raw = ''.join(content).replace("\n", "")
        if Parameter.has(raw):
            params = raw[raw.index(r'@retrofit2'):]
        raw = raw.replace(" ", "")

        function = Function()

        if Header.has(raw):
            function.headers = Header.parse(raw)

        function.name = re.findall(r'>(.*?)\(', raw)[0]
        function.api = Api.parse(raw)
        function.response = re.findall(r'Call<(.*?)>', raw)[0]

        if Parameter.has(raw):
            function.parameters = Parameter.parse(params)

        return function

    def querypath(self):
       querypath = "\"" + self.api.address + "\""

       paths = self.pathparameters()
       if paths is not None:
           for path in paths:
               old = "{" + path.key + "}"
               new = "\" + " + path.name + " + \""
               querypath = querypath.replace(old, new)

               del old, new

       queries = self.queryparameters()
       if queries is not None:
           querypath += " + \"?\" + "
           for query in queries:
               querypath += "\"" + query.key + "=\" + " + query.name
               if queries.index(query) != len(queries) - 1:
                   querypath += " + \"&\" + "

       del paths, queries

       return querypath

    def bodyparameter(self):
        for parameter in self.parameters:
            if parameter.annotation == "Body":
                return parameter

        return None

    def pathparameters(self):
        paths = None

        for parameter in self.parameters:
            if parameter.annotation == "Path":
                if paths is None:
                    paths = []

                paths.append(parameter)

        return paths

    def queryparameters(self):
        queries = None

        for parameter in self.parameters:
            if parameter.annotation == "Query":
                if queries is None:
                    queries = []

                queries.append(parameter)

        return queries


class Clazz:
    name = None
    functions = None

    def __init__(self):
        pass

    @staticmethod
    def parse(lines):
        clazz = Clazz()

        intervals = []
        interval = Interval()

        for index in range(0, len(lines)):
            line = lines[index]
            if (line == '   */\n'):
                interval = Interval()
                interval.start = index + 1
                continue
            if(line.endswith(');\n')):
                interval.end = index + 1
                intervals.append(interval)

        del line

        for interval in intervals:
            content = lines[interval.start: interval.end]

            function = Function.parse(content)

            if clazz.functions is None:
                clazz.functions = []

            clazz.functions.append(function)
            del content

        return clazz

#end retro -parser classes
def constant(f):
    def fset(self, value):
        raise TypeError
    def fget(self):
        return f()
    return property(fget, fset)

class _CodeLine(object):
    @constant
    def NEWLINE():
		return '\n'
    @constant
    def SPACE_AFTER():
        return "    "
    @constant
    def SLASH():
        return "/"
    @constant
    def DOT():
        return "."

class _DevelopmentEnvoirment(object):
	@constant
	def LOCAL():
		return 'LOCAL'
	@constant
	def ONLINE():
		return 'ONLINE'

class _MessageType(object):
	@constant
	def INFO():
		return 'INFO'
	@constant
	def ERROR():
		return 'ERROR'
	@constant
	def SUCCESS():
		return 'SUCCESS'
#MESSAGE INIT
MESSAGE = _MessageType()
DEV_ENV = _DevelopmentEnvoirment()
CODING = _CodeLine()

def showErrorMessages(messageType,message):
	if intern(MESSAGE.ERROR) is intern(messageType):
		print ('\x1b[6;30;41m' + message + '\x1b[0m')
	elif intern(MESSAGE.SUCCESS) is intern(messageType):
		print ('\x1b[6;30;42m' + message + '\x1b[0m')
	elif intern(MESSAGE.INFO) is intern(messageType):
		print ('\x1b[7;37;40m' + message + '\x1b[0m')

param_url = ''
param_package = ''
param_serviceName = ''
swagger_root_http_url = ''
JAVA = ".java"
MODULES = 'networking'
MODELS = 'models'
JAVA_ANDROID_ROOT_PATH = "/app/src/main/java"
JAVA_ANDROID_UNIT_TEST_ROOT_PATH = "/app/src/androidTest/java"
package_path = ""
NETWORKNG_SWAGGER_MANAGER_TEMPLATE = "Networking_swaggger_manager_template"
#FOR UNIT Test
NETWORKNG_SWAGGER_UNIT_TEST_TEMPLATE = "Networking_swagger_unit_test_class_template"
IS_ENABLE_UNIT_TEST_GENERATE = False
manager_filename = 'ServiceManager.java'
unit_test_filename = 'NetworkingInstrumentedTest.java'
manager_file_content = ''
unit_test_file_content = ''

SWAGGER_CLIENT_FILEPATH = 'src/main/java/io/swagger/client/'


last_request_cache_key = ""
last_request_cache_content = ""


#CHILD
CHILD_MANAGER_IMPORT_PACKAGE_TEMPLATE = "Networking_swagger_import_package_inner_template"
CHILD_MANAGER_ADD_HEADER_TEMPLATE = "Networking_swagger_add_header_inner_template"
CHILD_MANAGER_GET_FUNC_TEMPLATE = "Networking_swagger_managerclass_request_func_get_child_inner_template"
CHILD_MANAGER_GET_FUNC_NO_SEMICOLON_TEMPLATE = "Networking_swagger_managerclass_request_func_get_no_semicolon_child_inner_template"
CHILD_MANAGER_POST_FUNC_TEMPLATE = "Networking_swagger_managerclass_request_func_post_child_inner_template"
CHILD_MANAGER_POST_FUNC_NO_SEMICOLON_TEMPLATE = "Networking_swagger_managerclass_request_func_post_no_semicolon_child_inner_template"
CHILD_MANAGER_IMPORT_PACKAGE_TEMPLATE = "Networking_swagger_import_package_inner_template"
CHILD_UNIT_TEST_GET_FUNC_TEMPLATE = "Networking_swagger_unit_test_request_func_get_template"
CHILD_UNIT_TEST_POST_FUNC_TEMPLATE = "Networking_swagger_unit_test_request_func_post_template"

TEMPLATE_FOLDER = "template/"
ONLINE_FOLDER = "https://raw.githubusercontent.com/umutboz/networking-swagger/master/template/"
parent_module = ''
sub_module = ''

root_path = ''
unit_test_root_path = ''
manager_file_path = ''
unit_test_file_path = ''

sub_module_type = '-s'
#folders = [WIREFRAME, INTERACTOR, VIEW ,PRESENTER, PROTOCOLS ]
##CURRENT_DEV_ENV LOCAL OR ONLINE(Github)
#CURRENT_DEV_ENV = DEV_ENV.ONLINE
CURRENT_DEV_ENV = DEV_ENV.ONLINE
SWIFT = ".swift"
model_package = "//{{model_package}}"
request_func = "//{{request_func}}"
unit_test_func = "//{{unit_test_func}}"

def initVariables():
    global CHILD_UNIT_TEST_POST_FUNC_TEMPLATE,CHILD_UNIT_TEST_GET_FUNC_TEMPLATE,NETWORKNG_SWAGGER_UNIT_TEST_TEMPLATE, IS_ENABLE_UNIT_TEST_GENERATE,replacement,child_replacement, last_request_cache_key, last_request_cache_content ,NETWORKNG_SWAGGER_MANAGER_TEMPLATE,CHILD_MANAGER_ADD_HEADER_TEMPLATE, CHILD_MANAGER_GET_FUNC_TEMPLATE,CHILD_MANAGER_GET_FUNC_NO_SEMICOLON_TEMPLATE,CHILD_MANAGER_POST_FUNC_TEMPLATE, CHILD_MANAGER_POST_FUNC_NO_SEMICOLON_TEMPLATE,CHILD_MANAGER_IMPORT_PACKAGE_TEMPLATE, swagger_root_http_url
    if intern(DEV_ENV.ONLINE) is intern(CURRENT_DEV_ENV):
        NETWORKNG_SWAGGER_MANAGER_TEMPLATE = ONLINE_FOLDER + NETWORKNG_SWAGGER_MANAGER_TEMPLATE
        CHILD_MANAGER_ADD_HEADER_TEMPLATE = ONLINE_FOLDER + CHILD_MANAGER_ADD_HEADER_TEMPLATE
        CHILD_MANAGER_GET_FUNC_TEMPLATE = ONLINE_FOLDER + CHILD_MANAGER_GET_FUNC_TEMPLATE
        CHILD_MANAGER_GET_FUNC_NO_SEMICOLON_TEMPLATE = ONLINE_FOLDER + CHILD_MANAGER_GET_FUNC_NO_SEMICOLON_TEMPLATE
        CHILD_MANAGER_POST_FUNC_TEMPLATE = ONLINE_FOLDER + CHILD_MANAGER_POST_FUNC_TEMPLATE
        CHILD_MANAGER_POST_FUNC_NO_SEMICOLON_TEMPLATE = ONLINE_FOLDER + CHILD_MANAGER_POST_FUNC_NO_SEMICOLON_TEMPLATE
        CHILD_MANAGER_IMPORT_PACKAGE_TEMPLATE = ONLINE_FOLDER +  CHILD_MANAGER_IMPORT_PACKAGE_TEMPLATE
        NETWORKNG_SWAGGER_UNIT_TEST_TEMPLATE = ONLINE_FOLDER +  NETWORKNG_SWAGGER_UNIT_TEST_TEMPLATE
        CHILD_UNIT_TEST_GET_FUNC_TEMPLATE = ONLINE_FOLDER + CHILD_UNIT_TEST_GET_FUNC_TEMPLATE
        CHILD_UNIT_TEST_POST_FUNC_TEMPLATE = ONLINE_FOLDER + CHILD_UNIT_TEST_POST_FUNC_TEMPLATE

    else:
        NETWORKNG_SWAGGER_MANAGER_TEMPLATE = TEMPLATE_FOLDER + NETWORKNG_SWAGGER_MANAGER_TEMPLATE
        CHILD_MANAGER_ADD_HEADER_TEMPLATE = TEMPLATE_FOLDER + CHILD_MANAGER_ADD_HEADER_TEMPLATE
        CHILD_MANAGER_GET_FUNC_TEMPLATE = TEMPLATE_FOLDER + CHILD_MANAGER_GET_FUNC_TEMPLATE
        CHILD_MANAGER_GET_FUNC_NO_SEMICOLON_TEMPLATE = TEMPLATE_FOLDER + CHILD_MANAGER_GET_FUNC_NO_SEMICOLON_TEMPLATE
        CHILD_MANAGER_POST_FUNC_TEMPLATE = TEMPLATE_FOLDER + CHILD_MANAGER_POST_FUNC_TEMPLATE
        CHILD_MANAGER_POST_FUNC_NO_SEMICOLON_TEMPLATE = TEMPLATE_FOLDER + CHILD_MANAGER_POST_FUNC_NO_SEMICOLON_TEMPLATE
        CHILD_MANAGER_IMPORT_PACKAGE_TEMPLATE = TEMPLATE_FOLDER + CHILD_MANAGER_IMPORT_PACKAGE_TEMPLATE
        NETWORKNG_SWAGGER_UNIT_TEST_TEMPLATE = TEMPLATE_FOLDER +  NETWORKNG_SWAGGER_UNIT_TEST_TEMPLATE
        CHILD_UNIT_TEST_GET_FUNC_TEMPLATE  = TEMPLATE_FOLDER + CHILD_UNIT_TEST_GET_FUNC_TEMPLATE
        CHILD_UNIT_TEST_POST_FUNC_TEMPLATE = TEMPLATE_FOLDER + CHILD_UNIT_TEST_POST_FUNC_TEMPLATE
def createFolder ():
    if not os.path.isdir(root_path):
        os.makedirs(root_path)
        showErrorMessages(MESSAGE.INFO,root_path)

    #print root_path + CODING.SLASH + MODULES
    if not os.path.isdir(root_path + CODING.SLASH + MODULES):
        os.makedirs(root_path + CODING.SLASH + MODULES)
        showErrorMessages(MESSAGE.INFO,root_path + CODING.SLASH + MODULES)
    if not os.path.isdir(root_path + CODING.SLASH + MODULES + CODING.SLASH + MODELS):
        os.makedirs(root_path + CODING.SLASH + MODULES + CODING.SLASH + MODELS)
        showErrorMessages(MESSAGE.INFO,root_path + CODING.SLASH + MODULES + CODING.SLASH + MODELS)
    if not os.path.isdir(unit_test_root_path):
        os.makedirs(unit_test_root_path)
        showErrorMessages(MESSAGE.INFO,unit_test_root_path)
    if not os.path.isdir(unit_test_root_path + CODING.SLASH + package_path):
        os.makedirs(unit_test_root_path + CODING.SLASH + package_path)
        showErrorMessages(MESSAGE.INFO,unit_test_root_path + CODING.SLASH + package_path)
	#for folder in folders:
	#	
	#	if not os.path.isdir(root_path + folder):
	#		os.makedirs(root_path + folder)


def validateParentModulePath():
    validateStatus = False
    if os.path.isdir(MODULES):
        validateStatus = True
    validateStatus = False
    if os.path.isdir(root_path):
        validateStatus = True
    for folder in folders:
        validateStatus = False
        if os.path.isdir(root_path + folder):
            validateStatus = True
    return validateStatus

def multiple_replace(string, rep_dict):
	pattern = re.compile("|".join([re.escape(k) for k in sorted(rep_dict,key=len,reverse=True)]), flags=re.DOTALL)
	return pattern.sub(lambda x: rep_dict[x.group(0)], string)

def createFile(fileName, content):
	text_file = open(fileName, "w")
	text_file.write(content)
	text_file.close()

def appendFile(fileName,content,isTruncate=False):
    with open(fileName, "r+") as f:
        #f.seek(0)
        if isTruncate:
            f.truncate()
        f.write(content)
        f.close()

def getFileContent(file):
    global last_request_cache_key, last_request_cache_content
    fileContent = ""
    if intern(DEV_ENV.LOCAL) is intern(CURRENT_DEV_ENV):
        data = open(os.getcwd() + CODING.SLASH  + file,"r").read(20000) #opens file with name of "test.txt"
        fileContent = data.strip()
        return fileContent
    else:
        try:
            if intern(last_request_cache_key) is intern(file):
                #print "cached data : " + file
                return last_request_cache_content
            gcontext = ssl.SSLContext(ssl.PROTOCOL_TLSv1)
            data = urllib2.urlopen(file, context=gcontext).read(20000)
            fileContent=data.strip()
            last_request_cache_key = file
            last_request_cache_content = fileContent
        except urllib2.HTTPError as e:
            print('HTTPError = ' + str(e.code))
        except urllib2.URLError as e:
            print('URLError = ' + str(e.reason))
        except Exception as e:
            print('generic exception: ' + str(e))
        return fileContent


def replaceAndCreateCodingContent(template_file):
    #print template_file
    temp_file_content = multiple_replace(getFileContent(template_file),  child_replacement)
    #print "content " + template_file
    return temp_file_content

def insertOtherString (source_str, insert_str, pos):
    return source_str[:pos]+insert_str+source_str[pos:]

def childInsertMember(childInnerTemplate,insertingModule, subType):
    templateDataPath = insertingModule
    #print templateDataPath
    #showErrorMessages(MESSAGE.ERROR,  "childInsertMember " + templateDataPath)
    #TODO REMOVE
    #UNIT TEST CLASSI KOMPLE REMOVE
    #if subType == 2:
     #   removeChildContent(childInnerTemplate = childInnerTemplate, removingModule = insertingModule)
      #  generic_child_inner_template_content = replaceAndCreateCodingContent(childInnerTemplate)
       # data = open(templateDataPath ,"r").read(500000)
   
    removeChildContent(childInnerTemplate = childInnerTemplate, removingModule = insertingModule)
    generic_child_inner_template_content = replaceAndCreateCodingContent(childInnerTemplate)
    data = open(templateDataPath ,"r").read(500000)
    
      

    #if subType == 2:
        #print "data : " + generic_child_inner_template_content
    #import package
    if subType == 0:
        subTypeString = model_package
        child_inner_index = str(data.strip()).index(subTypeString) + len(subTypeString) + 1
        fileContent =  insertOtherString(str(data.strip()), generic_child_inner_template_content + CODING.NEWLINE,child_inner_index)
    elif subType == 1:
        subTypeString = request_func
        child_inner_index = str(data.strip()).index(subTypeString) + len(subTypeString) + 1
        fileContent =  insertOtherString(str(data.strip()), CODING.NEWLINE + generic_child_inner_template_content + CODING.NEWLINE,child_inner_index)
    elif subType == 2:
        subTypeString = unit_test_func
        child_inner_index = str(data.strip()).index(subTypeString) + len(subTypeString) + 1
        fileContent =  insertOtherString(str(data.strip()), CODING.SPACE_AFTER + generic_child_inner_template_content + CODING.NEWLINE + CODING.NEWLINE ,child_inner_index)
   
    appendFile(fileName=templateDataPath,content=fileContent)



def removeChildContent(childInnerTemplate,removingModule):
    #templateDataPath =  os.getcwd() + JAVA_ANDROID_ROOT_PATH + package_path + CODING.SLASH  + removingModule
    templateDataPath = removingModule
    generic_child_inner_template_content = replaceAndCreateCodingContent(childInnerTemplate)
    #print generic_child_inner_template_content
    data = open(templateDataPath ,"r").read(500000)
    remove_child_replacement = { generic_child_inner_template_content : ""}
    remove_replace_content = data.strip().replace(generic_child_inner_template_content, "" )
    #print remove_replace_content
    appendFile(fileName=templateDataPath,content=remove_replace_content, isTruncate=True)

def removeChildFile(module, subTemplateFile,subModuleFileName):
    sub_created_filename = param_package + subModuleFileName
    showErrorMessages(MESSAGE.INFO,sub_created_filename)
	#model wirefamre replacement
    sub_created_file_path = root_path + module + CODING.SLASH + sub_created_filename
    if os.path.exists(sub_created_file_path):
        os.remove(sub_created_file_path)

def createSubModule(module, subTemplateFile,subModuleFileName):
    #WIREFRAME operations BEGIN
	sub_created_filename = param_package + subModuleFileName
	showErrorMessages(MESSAGE.INFO,sub_created_filename)
	#model wirefamre replacement
	sub_created_file_content =  multiple_replace(getFileContent(subTemplateFile),  child_replacement)
	sub_created_file_path = root_path + module + CODING.SLASH + sub_created_filename
	createFile(sub_created_file_path,sub_created_file_content)
	#WIREFRAME operations END

def createParentModules():
	global manager_filename,unit_test_filename,manager_file_path#,presenter_filename, view_filename,interactor_filename,wireframe_filename
	#NETWORKING SWAGGER MANAGER operations BEGIN
	manager_filename = MODULES + CODING.SLASH + param_serviceName + manager_filename
	showErrorMessages(MESSAGE.INFO,manager_filename)
	#model manager replacement
	manager_file_content =  multiple_replace(getFileContent(NETWORKNG_SWAGGER_MANAGER_TEMPLATE),  replacement)
	#print manager_file_content
	#manager file create
	manager_file_path = root_path + CODING.SLASH + manager_filename

	#showErrorMessages(MESSAGE.ERROR,manager_file_path)
	createFile(manager_file_path,manager_file_content)
	#NETWORKING SWAGGER MANAGER operations END


def createUnitTestModule():
    global unit_test_filename,unit_test_file_content,replacement,child_replacement,unit_test_file_path
    if IS_ENABLE_UNIT_TEST_GENERATE == True:
        unit_test_filename = param_serviceName + unit_test_filename
        #showErrorMessages(MESSAGE.INFO,unit_test_filename)
        replacement = { "[SERVICE_NAME]" : param_serviceName ,"[PACKAGE_NAME]" : param_package}
        unit_test_file_content =  multiple_replace(getFileContent(NETWORKNG_SWAGGER_UNIT_TEST_TEMPLATE),  replacement)

        unit_test_file_path = unit_test_root_path  + package_path + CODING.SLASH + unit_test_filename
        createFile(unit_test_file_path,unit_test_file_content)
        
        oldModelPath = root_path + CODING.SLASH + MODULES + CODING.SLASH + MODELS 
        print oldModelPath
        for model in getModels(oldModelPath):
            #print root_path + CODING.SLASH + MODULES + CODING.SLASH + MODELS + CODING.SLASH + model[0]
            child_replacement = { "[PACKAGE_NAME]" : param_package , "[MODEL_NAME]" : "models" + CODING.DOT + model[0]}
            childInsertMember(childInnerTemplate=CHILD_MANAGER_IMPORT_PACKAGE_TEMPLATE,insertingModule=unit_test_file_path, subType=0)


def runSwaggerModelOperations():
    global child_replacement
    #showErrorMessages(MESSAGE.ERROR,  "hope " + manager_file_path)
    #print os.getcwd() + CODING.SLASH + SWAGGER_CLIENT_FILEPATH + "model/"
    oldModelPath = os.getcwd() + CODING.SLASH  + SWAGGER_CLIENT_FILEPATH + "model/"
    for model in getModelsAndReplacePackage(oldModelPath, param_package + CODING.DOT + MODULES + CODING.DOT  + MODELS + ";"):
        os.rename(oldModelPath + CODING.SLASH + model[0] + JAVA, root_path + CODING.SLASH + MODULES + CODING.SLASH + MODELS + CODING.SLASH + model[0] +  JAVA)
        #print root_path + CODING.SLASH + MODULES + CODING.SLASH + MODELS + CODING.SLASH + model[0]
        child_replacement = { "[PACKAGE_NAME]" : param_package , "[MODEL_NAME]" : "models" + CODING.DOT + model[0]}
        childInsertMember(childInnerTemplate=CHILD_MANAGER_IMPORT_PACKAGE_TEMPLATE,insertingModule=manager_file_path, subType=0)

    shutil.rmtree(oldModelPath)
    shutil.rmtree("docs")
    shutil.rmtree( os.getcwd() + CODING.SLASH + "src/test")

def getModelsAndReplacePackage(path, packageName):
    subList = os.listdir(path)
    # line split folde rname
    replaceModelPackage(path, packageName, subList)
    listNew = list(map(lambda x:  re.split('.java', x), subList))
    return listNew

def getModels(path):
    subList = os.listdir(path)
    # line split folde rname
    listNew = list(map(lambda x:  re.split('.java', x), subList))
    return listNew

def replaceModelPackage(path, packageName, subList):
    packageName = 'package '+packageName + '\n'
    for subItem in subList:
        with open(path+subItem, "r") as file:
            lineDatas = file.readlines()
        # line number
        index = 0
        for line in lineDatas:
            if line.__contains__('package'):
                lineDatas[index] = packageName

            if line.__contains__('import io.swagger.annotations.ApiModel'):
                lineDatas[index] = ""

            if line.__contains__('@javax.annotation.Generated'):
                lineDatas[index] = ""

            if line.__contains__('ApiModelProperty'):
                lineDatas[index] = ""

            if line.__contains__('import io.swagger.client.model'):
                dotPackageSplit = lineDatas[index].split(".")
                lineDatas[index] = "import " + param_package + CODING.DOT + MODULES + CODING.DOT + MODELS + CODING.DOT + dotPackageSplit[len(dotPackageSplit)-1]

            index += 1
        with open(path+subItem, 'w') as file:
            file.writelines(lineDatas)

def runRetrofitParser():
    generateApiFuncCount = 0
    oldApiPath = os.getcwd() + CODING.SLASH  + SWAGGER_CLIENT_FILEPATH + "api/"
    subList = os.listdir(oldApiPath)
    for apiFile in subList:
        apiFilePath = oldApiPath + apiFile

        with open(apiFilePath) as fp:
            lines = fp.readlines()

            clazz = Clazz.parse(lines)
            showErrorMessages(MESSAGE.INFO,str(len(clazz.functions)) + str(clazz.name) + " api func generating...")
            generateApiFuncCount += generateNetworkingFunc(clazz.functions)
            if IS_ENABLE_UNIT_TEST_GENERATE == True:
                generateUnitTestFunc(clazz.functions)
    #print len(clazz.functions)
    '''
    public GenericObjectRequest [FUNC_NAME](final NetworkResponseListener<[RESULT_MODEL_NAME], ServiceErrorModel> listener) {
         return manager.get("[QUERY_PATH]", listener);
     }
       public GenericObjectRequest [FUNC_NAME]([REQUEST_MODEL_NAME] model, final NetworkResponseListener<[RESULT_MODEL_NAME], ServiceErrorModel> listener) {
       return manager.post("[QUERY_PATH]", model, listener);
     }
    '''
    #print clazz.functions[0].querypath()
    showErrorMessages(MESSAGE.INFO,str(generateApiFuncCount) + " api func generated")
    shutil.rmtree(oldApiPath)
    shutil.rmtree(os.getcwd() + CODING.SLASH  + "src/main/java/io/" )
    

    del lines


def generateNetworkingFunc(Functions):
    global child_replacement
    generateApiFuncCount = 0
    for func in Functions:
        showErrorMessages(MESSAGE.INFO,  func.name + " api func generating...")
        hasInlineParam = False
        funcInlineParam = ""
        funcBodyInlineParam = ""
        if len(func.parameters) > 0:
            for param in func.parameters:
                #print param.name + " " + param.clazz + " type : " + param.annotation
                if param.annotation == "Query" or param.annotation == "Path":
                    hasInlineParam = True
                    funcInlineParam += "," + param.clazz + " " + param.name
                if param.annotation == "Body":
                    funcBodyInlineParam = param.clazz
            #print param.name + " " + param.clazz + " type : " + param.annotation
            #print func.bodyparameter

#print func.name + " " + func.api.method + " " + func.api.address + " " + func.response + " " + func.querypath()
#GET FUNC
        if intern(func.api.method) is intern("GET"):
            if hasInlineParam == True:
                child_replacement = { "[FUNC_NAME]" : func.name , "[RESULT_MODEL_NAME]" : func.response, "[QUERY_PATH]" : func.querypath() , "[FUNC_PARAM]" : funcInlineParam }
            else:
                child_replacement = { "[FUNC_NAME]" : func.name , "[RESULT_MODEL_NAME]" : func.response, "[QUERY_PATH]" : func.querypath() , "[FUNC_PARAM]" : "" }
            childInsertMember(childInnerTemplate=CHILD_MANAGER_GET_FUNC_TEMPLATE,insertingModule=manager_file_path, subType=1)
            generateApiFuncCount = generateApiFuncCount + 1
        elif intern(func.api.method) is intern("POST"):
            if hasInlineParam == True:
                child_replacement = { "[FUNC_NAME]" : func.name , "[RESULT_MODEL_NAME]" : func.response, "[QUERY_PATH]" : func.querypath() , "[FUNC_PARAM]" : funcInlineParam , "[REQUEST_MODEL_NAME]" : funcBodyInlineParam}
            else:
                child_replacement = { "[FUNC_NAME]" : func.name , "[RESULT_MODEL_NAME]" : func.response, "[QUERY_PATH]" : func.querypath() , "[FUNC_PARAM]" : "", "[REQUEST_MODEL_NAME]" : funcBodyInlineParam}
            childInsertMember(childInnerTemplate=CHILD_MANAGER_POST_FUNC_TEMPLATE,insertingModule=manager_file_path, subType=1)
            generateApiFuncCount = generateApiFuncCount + 1
    return generateApiFuncCount

def generateUnitTestFunc(Functions):
    global child_replacement,unit_test_file_path
    for func in Functions:
        #showErrorMessages(MESSAGE.INFO,  func.name + " unit test func generating...")
        hasInlineParam = False
        funcInlineParam = ""
        funcBodyInlineParam = ""
        if len(func.parameters) > 0:
            for param in func.parameters:
                print param.name + " " + param.clazz + " type : " + param.annotation
                if param.annotation == "Query" or param.annotation == "Path":
                    hasInlineParam = True
                    if intern(str(param.clazz)) is intern("String"):
                        funcInlineParam += "," +  "\"test\""
                    elif intern(str(param.clazz)) is intern("Integer"):
                        funcInlineParam += "," + "1"
                    elif intern(str(param.clazz)) is intern("Long"):
                        funcInlineParam += "," + "1"
                if param.annotation == "Body":
                    funcBodyInlineParam = param.clazz
            #print param.name + " " + param.clazz + " type : " + param.annotation
            #print func.bodyparameter

#print func.name + " " + func.api.method + " " + func.api.address + " " + func.response + " " + func.querypath()
#GET FUNC
#'''
        if intern(func.api.method) is intern("GET"):
           
            if hasInlineParam == True:
                #showErrorMessages(MESSAGE.ERROR,"funcInlineParam : " + funcInlineParam)
                child_replacement = { "[FUNC_NAME]" : func.name , "[RESULT_MODEL_NAME]" : func.response, "[SERVICE_NAME]" : param_serviceName ,"[FUNC_PARAM]" : funcInlineParam }
            else:
                child_replacement = { "[FUNC_NAME]" : func.name , "[RESULT_MODEL_NAME]" : func.response, "[SERVICE_NAME]" : param_serviceName, "[FUNC_PARAM]" : "" }
            childInsertMember(childInnerTemplate=CHILD_UNIT_TEST_GET_FUNC_TEMPLATE,insertingModule=unit_test_file_path, subType=2)
        elif intern(func.api.method) is intern("POST"):
            if hasInlineParam == True:
                child_replacement = { "[FUNC_NAME]" : func.name , "[RESULT_MODEL_NAME]" : func.response, "[QUERY_PATH]" : func.querypath() , "[FUNC_PARAM]" : funcInlineParam , "[REQUEST_MODEL_NAME]" : funcBodyInlineParam}
            else:
                child_replacement = { "[FUNC_NAME]" : func.name , "[RESULT_MODEL_NAME]" : func.response, "[QUERY_PATH]" : func.querypath() , "[FUNC_PARAM]" : "", "[REQUEST_MODEL_NAME]" : funcBodyInlineParam}
            childInsertMember(childInnerTemplate=CHILD_UNIT_TEST_POST_FUNC_TEMPLATE,insertingModule=unit_test_file_path, subType=2)



#coding start
#networking-swagger -url -package -serviceName -resultJsonKey
if len(sys.argv) >= 4:
    param_url = str(sys.argv[1])
    param_package = str(sys.argv[2])
    param_serviceName = str(sys.argv[3])
    #http swagger url content print len(swagger_root_http_url.split('http'))
    for url_split_path in param_url.split(CODING.SLASH):
        if intern(url_split_path) is intern('swagger'):
            break
        swagger_root_http_url += url_split_path + CODING.SLASH
    #set env template sources
    initVariables()
    #init root Path
    for package_split_path in param_package.split("."):
        package_path += CODING.SLASH + package_split_path
    root_path = os.getcwd() + JAVA_ANDROID_ROOT_PATH + package_path
    unit_test_root_path = os.getcwd() + JAVA_ANDROID_UNIT_TEST_ROOT_PATH

    #print root_path
    replacement = { "[SERVICE_NAME]" : param_serviceName ,"[PACKAGE_NAME]" : param_package + CODING.DOT + MODULES + ";","[URL]" : swagger_root_http_url }
    #creatae networking-swagger-java folders
    createFolder()

    #swagger-codegen generate -i http://178.211.54.214:5000/swagger/v1/swagger.json -l java -Dmodels,apis --library retrofit2
    swagger_codegen_homebrew_cmd = 'swagger-codegen generate -i ' + param_url + ' -l java -Dmodels,apis --library retrofit2'
    os.system(swagger_codegen_homebrew_cmd)

    createParentModules()
    IS_ENABLE_UNIT_TEST_GENERATE = True
    createUnitTestModule()

    #swagger model replace package and move MODELS
    runSwaggerModelOperations()

    runRetrofitParser()
    




else:
    showErrorMessages(MESSAGE.ERROR,"networking-swagger -url -package -serviceName")
    showErrorMessages(MESSAGE.ERROR,"min 3 arguments in commands")
    '''

    elif intern(param_url) is intern(sub_module_type) and len(sys.argv) == 5 and str(sys.argv[4]).lower() == "remove".lower():
        sub_module = str(sys.argv[3])
        child_replacement = { "[MODEL]" : parent_module , "[modelLowerCase]" : parent_module.lower(), "[SUB]" : sub_module }
        removeChildContent(childInnerTemplate=CHILD_PROTOCOL_WIREFRAME_MODULE_METHOD_TEMPLATE, removingModule=PROTOCOLS)
        removeChildContent(childInnerTemplate=CHILD_PROTOCOL_INNER_MODULE_TEMPLATE, removingModule=PROTOCOLS)

        removeChildContent(childInnerTemplate=CHILD_WIFRAME_MODULE_METHOD_INNER_TEMPLATE, removingModule=WIREFRAME)
        removeChildContent(childInnerTemplate=CHILD_INTERACTOR_PRESENTER_MODULE_FIELD_TEMPLATE, removingModule = INTERACTOR)
        removeChildContent(childInnerTemplate=CHILD_INTERACTOR_INNER_MODULE_TEMPLATE, removingModule=INTERACTOR)
        removeChildFile(module=PRESENTER,subTemplateFile=CHILD_PRESENTER_TEMPLATE,subModuleFileName=sub_module + presenter_filename)
        removeChildFile(module=VIEW,subTemplateFile=CHILD_VIEW_TEMPLATE,subModuleFileName=sub_module + view_filename)

    elif intern(param_url) is intern(sub_module_type) and len(sys.argv) != 4:
        showErrorMessages(MESSAGE.ERROR,"viperize -typeName -parentModuleName -subModule")
        showErrorMessages(MESSAGE.ERROR,"-subModule command has not found")
    else:
        showErrorMessages(MESSAGE.ERROR,"viperize -typeName -parentModuleName -subModule")
        showErrorMessages(MESSAGE.ERROR,"-typeName command is not correct")
        showErrorMessages(MESSAGE.ERROR,"for parent module is use to -p , for sub module is use to -s")
'''
#os.system("rm -rf " + param)
#showErrorMessages(MESSAGE.SUCCESS,"child")
#os.path.isdir("/home/el")
#print type(protocol_file_content)
