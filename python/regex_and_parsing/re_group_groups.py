import re
result = re.search(r'([A-Za-z0-9])\1', input())
if result is None:
    print(-1)
else:
    print(result.group(1))
