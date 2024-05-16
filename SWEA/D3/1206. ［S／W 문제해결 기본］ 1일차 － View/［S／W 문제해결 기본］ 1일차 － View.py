T = 10
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n = int(input())
    apartment = list(map(int, input().split()))
    max_values = [ ]
    view_count = 0
    for i in range(2, n-2):
        max_values.append(apartment[i-1])
        max_values.append(apartment[i-2])
        max_values.append(apartment[i+1])
        max_values.append(apartment[i+2])
        
        if apartment[i] > max(max_values):
            tmp = apartment[i] - max(max_values)
            view_count += tmp
            
        max_values = [ ]
            
    print(f"#{test_case} {view_count}")
        
