def average(array):
    plant_height = list(set(array))
    plant_types = len(plant_height)
    total_height = 0.0
    for i in range(plant_types):
        total_height = total_height + plant_height[i]
    return total_height/plant_types


if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)
