import re

regex = re.compile(r'@(POST|GET)\(\"(.*?)\"\)')


class Api:

    method: str = None
    address: str = None

    def __init__(self):
        pass

    @staticmethod
    def parse(raw):
        api = Api()
        api.method = re.findall(regex, raw)[0][0]
        api.address = re.findall(regex, raw)[0][1]

        return api
