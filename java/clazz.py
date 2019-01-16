from java.function import Function
from interval import Interval


class Clazz:

    name: str = None
    functions: [Function] = None

    def __init__(self):
        pass

    @staticmethod
    def parse(lines):
        clazz = Clazz()

        intervals = []
        interval: Interval()

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
