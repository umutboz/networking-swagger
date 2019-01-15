#! /bin/sh
""":"
exec python $0 ${1+"$@"}
"""

import os
import sys
import re
import urllib2
import ssl

#1.0.0
#neteorking-swagger-java -url -package -serviceName -resultJsonKey

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
package_path = ""
NETWORKNG_SWAGGER_MANAGER_TEMPLATE = "Networking_swaggger_manager_template"
manager_filename = 'ServiceManager.java'
manager_file_content = ''

PRESENTER = 'Presenter'
PRESENTER_TEMPLATE = "Viper_presenter_template"
presenter_file_content = ''
presenter_filename = 'Presenter.swift'


VIEW = 'View'
VIEW_TEMPLATE = "Viper_view_template"
view_file_content = ''
view_filename = 'View.swift'


INTERACTOR = 'Interactor'
INTERACTOR_TEMPLATE = "Viper_interactor_template"
interactor_file_content = ''
interactor_filename = 'Interactor.swift'

WIREFRAME = 'WireFrame'
WIREFRAME_TEMPLATE = "Viper_wireframe_template"
wireframe_file_content = ''
wireframe_filename = 'WireFrame.swift'


#CHILD
CHILD_MANAGER_IMPORT_PACKAGE_TEMPLATE = "Networking_swagger_import_package_inner_template"
CHILD_MANAGER_ADD_HEADER_TEMPLATE = "Networking_swagger_add_header_inner_template"
CHILD_MANAGER_GET_FUNC_TEMPLATE = "Networking_swagger_managerclass_request_func_get_child_inner_template"
CHILD_MANAGER_GET_FUNC_NO_SEMICOLON_TEMPLATE = "Networking_swagger_managerclass_request_func_get_no_semicolon_child_inner_template"
CHILD_MANAGER_POST_FUNC_TEMPLATE = "Networking_swagger_managerclass_request_func_post_child_inner_template"
CHILD_MANAGER_POST_FUNC_NO_SEMICOLON_TEMPLATE = "Networking_swagger_managerclass_request_func_post_no_semicolon_child_inner_template"

TEMPLATE_FOLDER = "template/"
ONLINE_FOLDER = "https://raw.githubusercontent.com/umutboz/networking-swagger/master/template/"
parent_module = ''
sub_module = ''

root_path = ''

sub_module_type = '-s'
#folders = [WIREFRAME, INTERACTOR, VIEW ,PRESENTER, PROTOCOLS ]
##CURRENT_DEV_ENV LOCAL OR ONLINE(Github)
CURRENT_DEV_ENV = DEV_ENV.ONLINE
SWIFT = ".swift"
FOR_CHILD_INNER = "//{FOR SUB_IN}"
FOR_CHILD = "//{FOR SUB}"
def initVariables():
    global replacement, NETWORKNG_SWAGGER_MANAGER_TEMPLATE,CHILD_MANAGER_ADD_HEADER_TEMPLATE, CHILD_MANAGER_GET_FUNC_TEMPLATE,CHILD_MANAGER_GET_FUNC_NO_SEMICOLON_TEMPLATE,CHILD_MANAGER_POST_FUNC_TEMPLATE, CHILD_MANAGER_POST_FUNC_NO_SEMICOLON_TEMPLATE,swagger_root_http_url
    online_path = "https://raw.githubusercontent.com/umutboz/networking-swagger/master/template/"
    if intern(DEV_ENV.ONLINE) is intern(CURRENT_DEV_ENV):
        NETWORKNG_SWAGGER_MANAGER_TEMPLATE = ONLINE_FOLDER + NETWORKNG_SWAGGER_MANAGER_TEMPLATE
        CHILD_MANAGER_ADD_HEADER_TEMPLATE = ONLINE_FOLDER + CHILD_MANAGER_ADD_HEADER_TEMPLATE
        CHILD_MANAGER_GET_FUNC_TEMPLATE = ONLINE_FOLDER + CHILD_MANAGER_GET_FUNC_TEMPLATE
        CHILD_MANAGER_GET_FUNC_NO_SEMICOLON_TEMPLATE = ONLINE_FOLDER + CHILD_MANAGER_GET_FUNC_NO_SEMICOLON_TEMPLATE
        CHILD_MANAGER_POST_FUNC_TEMPLATE = ONLINE_FOLDER + CHILD_MANAGER_POST_FUNC_TEMPLATE
        CHILD_MANAGER_POST_FUNC_NO_SEMICOLON_TEMPLATE = ONLINE_FOLDER + CHILD_MANAGER_POST_FUNC_NO_SEMICOLON_TEMPLATE
        #CHILD_PROTOCOL_WIREFRAME_MODULE_METHOD_TEMPLATE = ONLINE_FOLDER + CHILD_PROTOCOL_WIREFRAME_MODULE_METHOD_TEMPLATE
        #CHILD_WIFRAME_MODULE_METHOD_INNER_TEMPLATE = ONLINE_FOLDER + CHILD_WIFRAME_MODULE_METHOD_INNER_TEMPLATE
        #CHILD_PRESENTER_TEMPLATE = ONLINE_FOLDER + CHILD_PRESENTER_TEMPLATE
        #CHILD_INTERACTOR_INNER_MODULE_TEMPLATE = ONLINE_FOLDER + CHILD_INTERACTOR_INNER_MODULE_TEMPLATE
        #CHILD_INTERACTOR_PRESENTER_MODULE_FIELD_TEMPLATE = ONLINE_FOLDER + CHILD_INTERACTOR_PRESENTER_MODULE_FIELD_TEMPLATE

    else:
        NETWORKNG_SWAGGER_MANAGER_TEMPLATE = ONLINE_FOLDER + NETWORKNG_SWAGGER_MANAGER_TEMPLATE
        CHILD_MANAGER_ADD_HEADER_TEMPLATE = ONLINE_FOLDER + CHILD_MANAGER_ADD_HEADER_TEMPLATE
        CHILD_MANAGER_GET_FUNC_TEMPLATE = ONLINE_FOLDER + CHILD_MANAGER_GET_FUNC_TEMPLATE
        CHILD_MANAGER_GET_FUNC_NO_SEMICOLON_TEMPLATE = ONLINE_FOLDER + CHILD_MANAGER_GET_FUNC_NO_SEMICOLON_TEMPLATE
        CHILD_MANAGER_POST_FUNC_TEMPLATE = ONLINE_FOLDER + CHILD_MANAGER_POST_FUNC_TEMPLATE
        CHILD_MANAGER_POST_FUNC_NO_SEMICOLON_TEMPLATE = ONLINE_FOLDER + CHILD_MANAGER_POST_FUNC_NO_SEMICOLON_TEMPLATE
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
	#for folder in folders:
	#	showErrorMessages(MESSAGE.INFO,root_path + folder)
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
	fileContent = ""
	if intern(DEV_ENV.LOCAL) is intern(CURRENT_DEV_ENV):
		data = open(os.getcwd() + CODING.SLASH  + file,"r").read(20000) #opens file with name of "test.txt"
		fileContent = data.strip()
		return fileContent
	else:
		try:
			gcontext = ssl.SSLContext(ssl.PROTOCOL_TLSv1)
			data = urllib2.urlopen(file, context=gcontext).read(20000)
			#data = data.split("\n")
			fileContent=data.strip()
		except urllib2.HTTPError as e:
			print('HTTPError = ' + str(e.code))
		except urllib2.URLError as e:
			print('URLError = ' + str(e.reason))
		except Exception as e:
			print('generic exception: ' + str(e))
		return fileContent

def replaceAndCreateCodingContent(template_file):
    temp_file_content = multiple_replace(getFileContent(template_file),  child_replacement)
    return temp_file_content

def insertOtherString (source_str, insert_str, pos):
    return source_str[:pos]+insert_str+source_str[pos:]

def childInsertMember(childInnerTemplate,insertingModule, subType):
    templateDataPath =  os.getcwd() + CODING.SLASH  + MODULES + CODING.SLASH + param_package + CODING.SLASH  + insertingModule + CODING.SLASH  + param_package + insertingModule + SWIFT
    #TODO REMOVE
    removeChildContent(childInnerTemplate = childInnerTemplate, removingModule = insertingModule)

    generic_child_inner_template_content = replaceAndCreateCodingContent(childInnerTemplate)
    data = open(templateDataPath ,"r").read(20000)

    if subType == 0:
        subTypeString = FOR_CHILD_INNER
    else:
        subTypeString = FOR_CHILD

    child_inner_index = str(data.strip()).index(subTypeString) + len(subTypeString) + 1
    if subType == 0:
        fileContent =  insertOtherString(str(data.strip()),CODING.SPACE_AFTER + generic_child_inner_template_content +
    CODING.NEWLINE,child_inner_index)
    else:
        fileContent =  insertOtherString(str(data.strip()),CODING.NEWLINE+CODING.NEWLINE+CODING.SPACE_AFTER + generic_child_inner_template_content +
    CODING.NEWLINE,child_inner_index)
    appendFile(fileName=templateDataPath,content=fileContent)



def removeChildContent(childInnerTemplate,removingModule):
    templateDataPath =  os.getcwd() + CODING.SLASH  + MODULES + CODING.SLASH + param_package + CODING.SLASH  + removingModule + CODING.SLASH  + param_package + removingModule + SWIFT
    generic_child_inner_template_content = replaceAndCreateCodingContent(childInnerTemplate)
    #print generic_child_inner_template_content
    data = open(templateDataPath ,"r").read(20000)
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
	global manager_filename#,presenter_filename, view_filename,interactor_filename,wireframe_filename
	#NETWORKING SWAGGER MANAGER operations BEGIN
	manager_filename = MODULES + CODING.SLASH + manager_filename
	showErrorMessages(MESSAGE.INFO,manager_filename)
	#model manager replacement
	manager_file_content =  multiple_replace(getFileContent(NETWORKNG_SWAGGER_MANAGER_TEMPLATE),  replacement)
	print manager_file_content
	#manager file create
	manager_file_path = root_path + CODING.SLASH + manager_filename
	print manager_file_path
	createFile(manager_file_path,manager_file_content)
	#NETWORKING SWAGGER MANAGER operations END


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

    #print root_path
    replacement = { "[SERVICE_NAME]" : param_serviceName ,"[PACKAGE_NAME]" : param_package ,"[URL]" : swagger_root_http_url }
    #creatae networking-swagger-java folders
    createFolder()
    swagger_codegen_homebrew_cmd = 'swagger-codegen generate -i ' + param_url + ' -l java -Dmodels'
    os.system(swagger_codegen_homebrew_cmd)
    createParentModules()
    pwd = '/Users/umut/Desktop/Architecture/Android Libraries/networking/networking-swagger/src/main/java/io/swagger/client/model/WebApiResponseUserLoginResultDto.java'
    if not os.path.exists('/Users/umut/Desktop/Architecture/Android Libraries/networking/networking-swagger/src/main/java/io/swagger/client/model/CarePlansDto.java'):
        print 'heello from end'
        showErrorMessages(MESSAGE.ERROR,"heello from end")
else:
    showErrorMessages(MESSAGE.ERROR,"networking-swagger -url -package -serviceName")
    showErrorMessages(MESSAGE.ERROR,"min 3 arguments in commands")
    '''
    replacement = { "[MODEL]" : param_package , "[modelLowerCase]" : param_package.lower()}

    #print param_url, root_path
    if intern(param_url) is intern(parent_module_t):
        #only PARENT parent_module commands
        #creatae viper folders
        createFolder()
        createParentModules()
        os.system("ls")
    elif intern(param_url) is intern(sub_module_type) and len(sys.argv) == 4:
        sub_module = str(sys.argv[3])
        child_replacement = { "[MODEL]" : parent_module , "[modelLowerCase]" : parent_module.lower(), "[SUB]" : sub_module }
        #exist parent module
        if validateParentModulePath():
            #first child protocol inner member
            #Parent WireFrameProtocol define inner child module Method
            #parent_module+Protocols.swift
            childInsertMember(childInnerTemplate=CHILD_PROTOCOL_WIREFRAME_MODULE_METHOD_TEMPLATE,insertingModule=PROTOCOLS, subType=0)
            childInsertMember(childInnerTemplate=CHILD_PROTOCOL_INNER_MODULE_TEMPLATE,insertingModule=PROTOCOLS, subType=1)
            #sub Wifreme Method in PArent Wifeframe
            childInsertMember(childInnerTemplate=CHILD_WIFRAME_MODULE_METHOD_INNER_TEMPLATE,insertingModule=WIREFRAME, subType=1)
            #create sub Presneter File
            createSubModule(module=PRESENTER,subTemplateFile=CHILD_PRESENTER_TEMPLATE,subModuleFileName = sub_module + presenter_filename)
            #create sub Presneter File
            #Parent Interecator define inner child module  Method
            #parent_module+Interacator.swift
            childInsertMember(childInnerTemplate=CHILD_INTERACTOR_PRESENTER_MODULE_FIELD_TEMPLATE,insertingModule=INTERACTOR, subType=0)
            childInsertMember(childInnerTemplate=CHILD_INTERACTOR_INNER_MODULE_TEMPLATE,insertingModule=INTERACTOR, subType=1)
        else:
            showErrorMessages(MESSAGE.ERROR,"viperize " + parent_module + " not found")
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
