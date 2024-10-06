#№8
n=int(input('n='))
if n<=9:
    for i in range(1,n+1):
        for r in range(1,i+1):
            print(r,sep='',end='')
        print()