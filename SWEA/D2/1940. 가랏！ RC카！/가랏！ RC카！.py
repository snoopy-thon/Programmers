T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n = int(input())
    acc_info = [list(map(int, input().split())) for _ in range(n)]
    distance = 0
    speed = 0
    
    for i in range(n):
        if acc_info[i][0] == 1:
            speed += acc_info[i][1]
        elif acc_info[i][0] == 2:
            speed -= acc_info[i][1] 
            if speed <= 0:
                speed = 0
      
       
        distance += speed
    print(f"#{test_case} {distance}")
        