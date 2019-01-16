import re
from java.header import Header
from java.api import Api
from java.parameter import Parameter


class Function:

    name: str = None
    api: Api = None
    headers: [Header] = None
    response: str = None
    parameters: [Parameter] = None

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
        querypath = self.api.address

        paths = self.pathparameters()
        if paths is not None:
            for path in paths:
                old = "{" + path.key + "}"
                new = "\" + " + path.name
                querypath = querypath.replace(old, new)

                del old, new

        queries = self.queryparameters()
        if queries is not None:
            querypath += " + \"?\" + "
            for query in queries:
                querypath += "\"" + query.key + "=\" + " + query.name

        del paths, queries

        return "\"" + querypath

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
