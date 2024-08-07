#4. Resolver el exponente x**n recursivamente
def expomqj(xmqj,nmqj):
    if nmqj==0:
        return 1
    else:
        return (xmqj*expomqj(xmqj,nmqj-1))
    
nmqj=int(input("intro n: "))
xmqj=int(input("intro x: "))
emqj=expomqj(xmqj,nmqj)
print("",xmqj,"^",nmqj,"=",emqj)