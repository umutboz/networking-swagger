import re

regex = re.compile(
    r'@retrofit2.http.(Query|Path|Body)\(?\"?(.*?)\"?\)? (.*?) (.*?),? ')


class Parameter:

    # Represents annotation is query, path or body
    annotation: str = None

    # Represents annotations key like @Query("_key_")
    key: str

    # Represents parameter name
    name: str = None

    # Represents parameter class type
    clazz: str = None

    def __init__(self):
        pass

    @staticmethod
    def has(raw):
        return r'@retrofit2' in raw

    @staticmethod
    def parse(params):
        parameters = []

        matches = re.findall(regex, params)
        for match in matches:
            parameter = Parameter()
            parameter.annotation = match[0]
            parameter.key = match[1] if match[1] is not '' else None
            parameter.clazz = match[2]
            parameter.name = match[3]

            parameters.append(parameter)

        return parameters
