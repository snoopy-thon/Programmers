T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    # ///////////////////////////////////////////////////////////////////////////////////
    num = []
    num = map(int, input().split())
    sum = 0
    for i in num :
        if i % 2 == 1 :
            sum += i
    print("#%d %d" %(test_case, sum))
    # ///////////////////////////////////////////////////////////////////////////////////
