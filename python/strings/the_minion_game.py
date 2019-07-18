def minion_game(string):
    kevin_count = 0
    stuart_count = 0
    string_length = len(string)
    vowel_list = ['A', 'E', 'I', 'O', 'U']
    for i, letter in enumerate(string):
        if string[i] in vowel_list:
            kevin_count += string_length - i
        else:
            stuart_count += string_length - i
    if kevin_count > stuart_count:
        print('Kevin '+str(kevin_count))
    elif kevin_count == stuart_count:
        print('Draw')
    else:
        print('Stuart '+str(stuart_count))


if __name__ == '__main__':
    s = input()
    minion_game(s)
