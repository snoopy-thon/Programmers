n = int(input())
for i in range(1, n+1):
    if '3' in str(i) or '6' in str(i) or '9' in str(i):
        for j in range(len(str(i))):
            if str(i)[j] == '3' or str(i)[j] == '6' or str(i)[j] == '9'  :
                print('-', end='')
        print(' ',end='')
    else:
        print(i, end=" ")
	