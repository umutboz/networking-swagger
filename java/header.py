import re

regex = re.compile(r'@Headers\({\"(.*?)\"}\)')


class Header:

    name: str = None
    value: str = None

    @classmethod
    def __init__(self, name: str, value: str):
        self.name = name
        self.value = value

    @staticmethod
    def has(raw):
        return len(re.findall(regex, raw)) > 0

    @staticmethod
    def parse(raw):
        headers = []
        contents = re.findall(regex, raw)[0].split(",")

        for content in contents:
            splits = content.split(":")

            header = Header(splits[0], splits[1])
            headers.append(header)

        return headers