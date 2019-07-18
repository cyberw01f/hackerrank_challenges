def mutate_string(string, position, character):
    temp_list = list(string)
    temp_list[position] = character
    return "".join(temp_list)


if __name__ == '__main__':
    s = input()
    i, c = input().split()
    s_new = mutate_string(s, int(i), c)
    print(s_new)
