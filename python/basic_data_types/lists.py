if __name__ == '__main__':
    N = int(input())
    my_list = []
    for inputs in range(0, N):
        full_input = str(input())
        input_string = full_input.strip().split(" ")
        task = input_string[0]
        if task == 'insert':
            index = int(input_string[1])
            variable = int(input_string[2])
            my_list.insert(index, variable)
        elif task == 'print':
            print(my_list)
        elif task == 'remove':
            variable = int(input_string[1])
            my_list.remove(variable)
        elif task == 'append':
            variable = int(input_string[1])
            my_list.append(variable)
        elif task == 'sort':
            my_list.sort()
        elif task == 'pop':
            my_list.pop()
        elif task == 'reverse':
            my_list.reverse()
