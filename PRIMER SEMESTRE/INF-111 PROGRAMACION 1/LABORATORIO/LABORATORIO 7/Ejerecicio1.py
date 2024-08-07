#1. dado un n, introducir valores numericos,sumar en rangos como indicar el primer elemento de cada rango.
nmqj=int(input("intro n: "))
pmqj=1;swmqj=0;smqj=0
for imqj in range(1,nmqj+1):
    xmqj=int(input("intro x: "))
    if swmqj==0:
        kmqj=xmqj;pmqj=1
        smqj=0;swmqj=1
    else:
        smqj=smqj+xmqj;pmqj=pmqj+1
        if pmqj>kmqj:
            print(smqj)
            swmqj=0