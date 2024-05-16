def recursion_func(n, m):
    if m == 0:
    	return 1
    else:
        return n * recursion_func(n,m-1)
T = 10
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    test_num = int(input())
    n, m = map(int, input().split())
    answer = recursion_func(n, m)
    print(f"#{test_case} {answer}")