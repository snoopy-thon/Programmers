n = int(input())
numbers = list(map(int, input().split()))
numbers.sort()
mid_index = n//2
print(numbers[mid_index])
