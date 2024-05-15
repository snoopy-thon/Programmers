import datetime

T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    m1, d1, m2, d2 = map(int, input().split())
    day1 = datetime.date(2023, m1, d1)
    day2 = datetime.date(2023, m2, d2)
    diff = day2 - day1
    print(f"#{test_case} {diff.days + 1}")