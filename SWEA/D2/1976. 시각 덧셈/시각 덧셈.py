T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    h1, m1, h2, m2 = map(int, input().split())
    tmp_h = h1 + h2
    tmp_m = m1 + m2
    if tmp_m >= 60:
        tmp_h += 1
        tmp_m -= 60
    if tmp_h > 12:
        tmp_h -= 12
    print(f"#{test_case} {tmp_h} {tmp_m}")
    