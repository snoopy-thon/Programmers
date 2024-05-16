T = 10

# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    sum_values = [ ]
    test_number = int(input())
    numbers = [list(map(int, input().split())) for _ in range(100)]
    sum_right_daegak = 0
    sum_left_daegak = 0
    for i in range(100):
        sum_garo = 0
        sum_sero = 0
        sum_right_daegak += numbers[i][i]
        for j in range(100):
            sum_garo += numbers[i][j]
            sum_sero += numbers[j][i]
            if i+j == 99:
                sum_left_daegak += numbers[i][j]
        sum_values.append(sum_garo)
        sum_values.append(sum_sero)
    sum_values.append(sum_right_daegak)
    sum_values.append(sum_left_daegak)
    		
        
    print(f"#{test_case} {max(sum_values)}")
        
   