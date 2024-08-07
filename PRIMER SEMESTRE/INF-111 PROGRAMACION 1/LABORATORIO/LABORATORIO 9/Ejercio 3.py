#3. Dado un lote de n numeros, rotar el o los digitod centrales a la derecha.
import math
def centromqj(wmqj):
    cdmqj=int(math.log(wmqj,10))+1
    pmqj=cdmqj//2
    kmqj=1
    if cdmqj%2==0:
        pmqj=pmqj-1
        kmqj=2
    wmqj=wmqj//10**pmqj
    ymqj=wmqj%10**kmqj
    return ymqj
def cambiomqj(wmqj,xmqj):
    cdmqj=int(math.log(wmqj,10))+1
    cd1mqj=int(math.log(xmqj,10))+1
    pmqj=cdmqj//2; kmqj=1
    if cdmqj%2==0:
        pmqj=pmqj-1
        kmqj=2
    amqj=wmqj%10**pmqj
    wmqj=wmqj//10**(pmqj+kmqj)
    wmqj=(wmqj*10**cd1mqj)+xmqj
    ymqj=(wmqj*10**pmqj)+amqj
    return ymqj

nmqj=int(input("intro n: "))
for imqj in range(1,nmqj+1):
    xmqj=int(input("intro x: "))
    if imqj==1:
        x1mqj=xmqj
        pmqj=centromqj(xmqj)
    else:
        p1mqj=centromqj(xmqj)
        ymqj=cambiomqj(xmqj, pmqj)
        print(ymqj)
        pmqj=p1mqj

ymqj=cambiomqj(x1mqj, pmqj)
print(ymqj)