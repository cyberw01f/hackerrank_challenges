M = int(input())
m = set(map(int, input().split()))
N = int(input())
n = set(map(int, input().split()))
temp_m = m.difference(n)
temp_n = n.difference(m)
final_list = list(sorted(temp_m.union(temp_n)))
for i in range(len(final_list)):
    print(final_list[i])
