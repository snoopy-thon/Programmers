T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n = int(input())
    money = [50000, 10000, 5000, 1000, 500, 100, 50, 10] 
    money_count = []
    for i in range(len(money)):
        count = n // money[i]
        money_count.append(count)
        n = n % money[i]
        
    print(f"#{test_case}")
    for j in money_count:
        print(j, end=" ")
    print()