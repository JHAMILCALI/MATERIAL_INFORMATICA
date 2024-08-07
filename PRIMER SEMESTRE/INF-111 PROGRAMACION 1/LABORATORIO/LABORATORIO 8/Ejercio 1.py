#1. Dado un lote de N numeros. Desplegue de cada numero del lote el factoriañ de los digitos pares
#y la sumatoria de los digitos impares.
def factomqj(wmqj):
    fmqj=1
    for imqj in range(1,wmqj+1):
        fmqj=fmqj*imqj
    return fmqj

def sumamqj(wmqj):
    smqj=0
    for imqj in range(1,wmqj+1):
        smqj=smqj+imqj
    return smqj

nmqj= int (input("intro n: "))
for imqj in range(nmqj):
    xmqj = int(input("intro x: "))
    while xmqj!=0:
        dmqj=xmqj%10
        xmqj=xmqj//10
        if dmqj%2==0:
            fmqj=factomqj(dmqj)
            print(fmqj)
        else:
            smqj=sumamqj(dmqj)
            print(smqj)
    