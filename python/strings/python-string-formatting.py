def print_formatted(number):
    temp_bin = str(bin(number))
    w = len(temp_bin[2:])
    for i in range(1, number+1):
        in_oct = str(oct(i))
        in_hex = str(hex(i))
        in_bin = str(bin(i))
        print('{:>{width}} {:>{width}} {:>{width}} {:>{width}}'
              .format(i, in_oct[2:], in_hex[2:].upper(), in_bin[2:], width=w))


if __name__ == '__main__':
    n = int(input())
    print_formatted(n)
