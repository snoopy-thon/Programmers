T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    numbers = list(map(int, input().split()))
    numbers.sort()
    sum = 0
    for i in range(1,len(numbers)-1):
        sum += numbers[i]
    avg = sum / (len(numbers) - 2) 
    print(f"#{test_case} {round(avg)}")
