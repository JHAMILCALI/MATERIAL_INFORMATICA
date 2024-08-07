#2. Resolver la siguente sumatoria para n terminos.
def factormqj(wmqj):
    fmqj=1
    for imqj in range(1,wmqj+1):
        fmqj=fmqj*imqj
    return fmqj

def fibomqj(wmqj):
    amqj=-1;bmqj=1
    for imqj in range(wmqj):
        dmqj=amqj+bmqj; amqj=bmqj; bmqj=dmqj
    return dmqj
nmqj = int(input("intro n: "))
xmqj = int(input("intro x: "))
smqj=0; sigmqj=1
for imqj in range(1,nmqj+1):
    smqj=smqj+sigmqj*(xmqj**fibomqj(imqj)/factormqj(imqj))
    print("", sigmqj,"*",xmqj,"^",fibomqj(imqj),"/",imqj,"!",end="+")
    if imqj%2==0:
        sigmqj=sigmqj*(-1)
print("=",smqj)