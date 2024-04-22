'''
a = int(input())                        정수형 변수 1개 입력 받는 예제
b, c = map(int, input().split())        정수형 변수 2개 입력 받는 예제 
d = float(input())                      실수형 변수 1개 입력 받는 예제
e, f, g = map(float, input().split())   실수형 변수 3개 입력 받는 예제
h = input()                             문자열 변수 1개 입력 받는 예제
'''

T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    # ///////////////////////////////////////////////////////////////////////////////////
    n = int(input())
    numList = [2,3,5,7,11]
    count = [0 for j in range(12)]
    for i in numList :
        if n % i != 0 :
            count[i] = 0
            continue
        else :
            while True:
                if  n % i != 0 :
                    break
                count[i] += 1
                n = n / i
     
    print('#%d %d %d %d %d %d' %(test_case, count[2], count[3], count[5], count[7], count[11]))
    # ///////////////////////////////////////////////////////////////////////////////////
