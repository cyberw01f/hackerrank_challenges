#!/bin/python3
import os


# Complete the solve function below.
def solve(s):
    split_s = s.split(' ')
    for i in range(len(split_s)):
        if split_s[i].isalpha():
            split_s[i] = split_s[i].title()
        elif split_s[i].isspace() is True:
            if split_s[i][0].isalpha():
                temp_split = list(split_s[i])
                print(temp_split)
                temp_split[0] = temp_split[0].upper()
                print(temp_split[0])
                split_s[i] = "".join(temp_split)
    return ' '.join(split_s)


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    s = input()
    result = solve(s)
    fptr.write(result + '\n')
