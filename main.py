import os
import sys
import re
from java.function import Function
from interval import Interval

path = 'assets/apis/AccountApi.java'

with open(path) as fp:
    lines = fp.readlines()

intervals = []
interval: Interval()
raws = []

for index in range(0, len(lines)):
    line = lines[index]
    if (line == '   */\n'):
        interval = Interval()
        interval.start = index + 1
        continue
    if(line.endswith(');\n')):
        interval.end = index + 1
        intervals.append(interval)

for interval in intervals:
    raw = ''.join(lines[interval.start: interval.end])
    print(raw)
    raws.append(raw)
