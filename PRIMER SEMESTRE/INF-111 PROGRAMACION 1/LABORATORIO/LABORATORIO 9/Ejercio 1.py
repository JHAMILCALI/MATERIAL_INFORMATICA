#Dado un lote de n numeros mostra de cada numero introducido, los
#digitos estremos, el digito menor, el digito mayor y partir el numero
#en dos partes y el centro:
import math
def extremqj(wmqj):
    global e1mqj; global e2mqj
    e2mqj = wmqj%10
    cdmqj = int(math.log(wmqj,10))+1
    e1mqj = wmqj//10**(cdmqj-1)
    return

def menmaymqj(wmqj):
    global m1mqj; global m2mqj
    m1mqj=9; m2mqj=0
    while wmqj!=0:
        dmqj = wmqj%10
        wmqj= wmqj//10
        if dmqj>m2mqj:
            m2mqj = dmqj
        if dmqj<m1mqj:
            m1mqj = dmqj
    return
def partirmqj(wmqj):
    global p1mqj; global p2mqj; global cemqj
    cdmqj = int(math.log(wmqj,10))+1
    pmqj = cdmqj//2
    cemqj = 0
    p2mqj = wmqj%10**pmqj
    p1mqj = wmqj//10**pmqj
    if cdmqj%2!=0:
        cemqj=p1mqj%10
        p1mqj=p1mqj//10
    return

nmqj = int(input("intro n: "))
for imqj in range(nmqj):
    xmqj=int(input("intro x: "))
    extremqj(xmqj)
    eximqj = e1mqj; exdmqj = e2mqj
    menmaymqj(xmqj)
    dmnmqj = m1mqj; dmymqj = m2mqj
    partirmqj(xmqj)
    parimqj=p1mqj;  pardmqj=p2mqj; cenmqj=cemqj
    print("\n",eximqj,", ",exdmqj)
    print("\n",dmnmqj,", ",dmymqj)
    print("\n",parimqj,", ",pardmqj,", ",cenmqj)