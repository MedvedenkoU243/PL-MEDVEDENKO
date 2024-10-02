#8.даны три целых числа. определите, сколько среди них совподающих.
#программа должна вывести одно из чисел: 3 (если все совпадают), 2 (если два совпадает) или 0 (если все числа различны)
a=int(input('a='))
b=int(input('b='))
c=int(input('c='))
if a==b and a==c and b==c:
    print(3)
elif (a!=b and b==c and a!=c) or (a!=b and b!=c and a==c) or (a==b and b!=c and a!=c):
    print(2)
else:
    print(0)