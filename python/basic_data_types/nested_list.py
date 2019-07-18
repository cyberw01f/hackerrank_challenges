if __name__ == '__main__':
    final_list = []
    final_students = []
    n = int(input())
    for _ in range(n):
        name = input()
        score = float(input())
        temp_list = [name, score]
        final_list.append(temp_list)

    final_list.sort(key=lambda x: x[1])
    for i in range(n):
        if final_list[i][1] != final_list[0][1]:
            second_lowest = final_list[i][1]
            break
    for i in range(n):
        if final_list[i][1] == second_lowest:
            final_students.append(final_list[i][0])
    final_students.sort()
    for i in range(len(final_students)):
        print(final_students[i])
