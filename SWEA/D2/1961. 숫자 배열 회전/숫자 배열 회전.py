
T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n = int(input())
    numbers = [list(input().split()) for _ in range(n)]
    answers = [[""]*3 for _ in range(n)]
    
    #answers[0][0] = numbers[2][0] + numbers[1][0] + numbers[0][0]
    #answers[1][0] = numbers[2][1] + numbers[1][1] + numbers[0][1]
    #answers[2][0] = numbers[2][2] + numbers[1][2] + numbers[0][2]
    
    for i in range(n):
        for j in reversed(range(n)):
            answers[i][0] += numbers[j][i]
            
    
            
    
    #answers[0][1] = numbers[2][2] + numbers[2][1] + numbers[2][0]
    #answers[1][1] = numbers[1][2] + numbers[1][1] + numbers[1][0]
    #answers[2][1] = numbers[0][2] + numbers[0][1] + numbers[0][0]
    
    for i in range(n):
        for j in reversed(range(n)):
            answers[i][1] += numbers[n-i-1][j]
           
    
    #answers[0][2] = numbers[0][2] + numbers[1][2] + numbers[2][2]
    #answers[1][2] = numbers[0][1] + numbers[1][1] + numbers[2][1]
    #answers[2][2] = numbers[0][0] + numbers[1][0] + numbers[2][0]
    
    for i in range(n):
        for j in range(n):
            answers[i][2] += numbers[j][n-i-1]
            
    print(f"#{test_case}")
    for k in range(n):
        print(*answers[k])