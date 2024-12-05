#1.A)Дано натуральные числа x, n. Вычислите выражение вида: x^n / n!.
def p(x,n):
    if n==0:
        return 1
    else:
        return x * p(x,n-1)
def f(n):
    if n==0:
        return 1
    else:
        return n*f(n-1)
def c(x,n):
    return p(x,n)/f(n)
#x=int(input('x = '))
#n=int(input('n = '))
#r=c(x,n)
#print(f"Результат выражения {x}^{n} / {n}! = {r}")
print()
#1.Б)
def fm():
    n=int(input("Введите натуральное число (0 для завершения): "))
    if n==0:
        return float('-inf')
    mr=fm()
    return max(n,mr)
maxv=fm()
print(f"Наибольшее значение в последовательности: {maxv}")
