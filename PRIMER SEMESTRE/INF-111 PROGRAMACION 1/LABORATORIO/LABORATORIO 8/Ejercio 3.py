#3. Resolver, factorial de un numero, recursivamente.
def factomqj(nmqj):
    if nmqj==0:
        return 1
    else:
        return(nmqj*factomqj(nmqj-1))
nmqj=int(input("intro n: "))
fmqj=factomqj(nmqj)
print("el facto de ",nmqj," es ",fmqj)