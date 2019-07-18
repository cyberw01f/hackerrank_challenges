from collections import OrderedDict


def merge_the_tools(string, k):
    n = len(string)
    temp_list = [(string[i:i+k]) for i in range(0, n, k)]
    for i in range(len(temp_list)):
        print("".join(OrderedDict.fromkeys(temp_list[i])))


if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
