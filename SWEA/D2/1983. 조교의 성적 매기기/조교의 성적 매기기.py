T = int(input())

# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    total_score = []
    grade = ["A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"]
    n, k = map(int, input().split())
    scores = [list(map(int, input().split())) for _ in range(n)]
    for i in range(n):
        total_score.append(scores[i][0] * 0.35 + scores[i][1] * 0.45 + scores[i][2] * 0.2)
        
    same_grade_count = n / 10
    sorted_total_score = sorted(total_score, reverse=True)
    rank = sorted_total_score.index(total_score[k-1])
    tmp = int(rank // same_grade_count)
    print(f"#{test_case} {grade[tmp]}")
    
        