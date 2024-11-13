#№8.1.Задана матрица порядка n и число к.
#Разделить элементы k-й строки на диагональный элемент, расположенный в этой строке
import numpy as np
N=int(input("N = "))
k=np.random.randint(N)
a=np.random.randint(10, 100, size=(N,N))
print(a)
for n in range(0,len(a)):
    print(a[k,n],'/',a[n,n],'=',a[k,n]/a[n,n])