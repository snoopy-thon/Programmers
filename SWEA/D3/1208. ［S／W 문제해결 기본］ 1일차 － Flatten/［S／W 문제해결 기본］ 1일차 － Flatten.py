T = 10
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    dump_count = int(input())
    boxes = list(map(int, input().split()))
    for i in range(dump_count):
        boxes.sort()
        if (boxes[99] - boxes[0]) <= 1:
            break
        boxes[99] -= 1
        boxes[0] += 1
    boxes.sort() # 마지막에 다시 정렬해줘야 결과적으로 최고점과 최저점의 차를 알 수 있음
    print(f"#{test_case} {boxes[99]-boxes[0]}")
