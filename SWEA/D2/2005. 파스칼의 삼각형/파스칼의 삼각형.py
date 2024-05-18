T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n = int(input())
    numbers = [[1]*k for k in range(1,n+1)]
    print(f"#{test_case}")
    
    print("1")
    if n != 1:
    	print("1 1")
    for i in range(2, n):
        print("1", end = ' ')
        for j in range(1, i):
            numbers[i][j] = numbers[i-1][j-1] + numbers[i-1][j]
            print(numbers[i][j], end=' ')
        print("1")
        
