T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n = int(input())
    numbers = list(map(int, input().split()))
    scores = [0 for i in range(101)]
    numbers.sort()
    max_score_count = scores[1]
    max_score = 0
    for i in numbers:
        scores[i] += 1
    for j in range(1, len(scores)): 
        if scores[j] >= max_score_count:
            max_score_count = scores[j]
            max_score = j
    print(f"#{n} {max_score}")
    
    
            
        
