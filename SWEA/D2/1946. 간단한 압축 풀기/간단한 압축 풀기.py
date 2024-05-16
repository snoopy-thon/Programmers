T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n = int(input())
    document = [list(input().split()) for _ in range(n)]
    count = 0
    print(f"#{test_case}")
    for m in range(n):
        for k in range(int(document[m][1])):
            print(document[m][0],end='')
            count += 1
            if count % 10 == 0:
                print("")
                
    print("")
            
        