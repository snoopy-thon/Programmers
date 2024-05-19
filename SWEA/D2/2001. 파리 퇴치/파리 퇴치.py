T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    tmp_sum = []
    n, m = map(int, input().split())
    flies = [list(map(int, input().split())) for _ in range(n)]
    
    for i in range(n-m+1):
        for j in range(n-m+1):
            tmp = []
            for k in range(m):
            	tmp.append(sum(flies[i+k][j:j+m]))
            tmp_sum.append(sum(tmp))
    print(f"#{test_case} {max(tmp_sum)}")
