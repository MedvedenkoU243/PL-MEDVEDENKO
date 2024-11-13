#№8.2.В массиве действительных чисел все нулевые элементы заменить на среднее арифметическое всех элементов
import random as rand
n=int(input("n= "))
if n>0:
    l=[-3+6*rand.random() for i in range(n)]
    print(l)
    sr=sum(l)/len(l)
    for k,x in enumerate(l):
        if x==0:
            l[k]=sr
    print(l)