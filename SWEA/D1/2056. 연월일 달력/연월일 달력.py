T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    list30 = [4,6,9,11]
    list31 = [1,3,5,7,8,10]
    userInput = input()
    month = int(userInput[4:6])
    date = int(userInput[6:])
    if month > 12 or month < 1 or date < 1:
        print("#%d -1" %test_case)
        continue
    elif month in list31 : 
    	if date > 31 :
        	print("#%d -1" %test_case)
        	continue
    elif month in list30 :
        if date > 30 :
        	print("#%d -1" %test_case)
        	continue
    elif month == 2 and date > 28 :
        print("#%d -1" %test_case)
        continue
    result = userInput[:4] + '/{0:02d}/{1:02d}'.format(month, date)
    print("#%d %s" %(test_case, result))
    
