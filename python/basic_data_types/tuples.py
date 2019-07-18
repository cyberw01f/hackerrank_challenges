if __name__ == '__main__':
    n = int(input())
    integer_list = input().strip().split()
    my_list = []
    for i in range(0, len(integer_list)):
        my_list.append(int(integer_list[i]))
    t = tuple(my_list)
    print(hash(t))
