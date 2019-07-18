def count_substring(string, sub_string):
    string_counter = 0
    for i in range(0, len(string)):
        if sub_string == string[i:i+len(sub_string)]:
            string_counter += 1
    return string_counter


if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()

    count = count_substring(string, sub_string)
    print(count)
