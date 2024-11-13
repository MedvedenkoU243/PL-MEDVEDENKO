#№8.2.Задана квадратная матрица.
#Получить транспонированную матрицу (перевернутую относительно диагонали) и вывести на экран
import numpy
s=int(input('Введите размер кв. матрицы: '))
n=list(map(int, input(f' Введите через пробел {s*s} чисел: ').split()))
m=[]
for i in range(0,len(n),s):
    m.append(n[i:i+s])
print(numpy.transpose(m))