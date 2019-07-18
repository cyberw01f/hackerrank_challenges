import re
s = input().strip()
k = input().strip()
found_flag = False
for i in range(len(s)):
    match_result = re.match(k, s[i:])
    if match_result:
        start_index = i+match_result.start()
        end_index = i+match_result.end()-1
        print((start_index, end_index))
        found_flag = True
if found_flag is False:
    print('(-1, -1)')
