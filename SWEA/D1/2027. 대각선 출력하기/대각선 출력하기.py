for i in range(5):
    for j in range(4):
        if j==i:
            print("#",end='')
        print("+", end='')
    if i == 4: print("#",end='')
    print()