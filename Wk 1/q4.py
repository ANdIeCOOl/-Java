def fun1(x):
    y = x+1
    def fun2(z):
        z = ((x+y)*(x-y))*z
        print(z)
fun2(2)

fun1(5)

def elementSum(n):
     sum = 0
     while (n != 0):
           sum = sum + n % 10
           n = n // 10
     return sum
num = 22
x = elementSum(num)
print(num)

def updateDict(d):
       d["rollno"] = 12
Dict = {"name" : "John", "Age" : 21}
updateDict(Dict)
print(Dict)