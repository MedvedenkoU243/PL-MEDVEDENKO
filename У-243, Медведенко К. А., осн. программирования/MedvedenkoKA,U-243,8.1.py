#№8.1.Найти все натуральные числа, не превосходящие заданного n,
#которые делятся на каждую из своих цифр
n=int(input("N="))
for i in range(1,n+1):
    d=str(i)
    g=True
    for r in d:
        if r=="0" or i%int(r)!=0:
            g=False
            break
    if g:
        print(i,end=" ")