#2.Dado un lote de n nimeros, mostrae el digito por ,as significativo y el digito
#impar menossignificativos de cada numero.

import math
def masmenosmqj(wmqj):
    global masmqj; global menmqj
    w1mqj=wmqj; swmqj=0
    while wmqj!=0 and swmqj!=1:
        dmqj = wmqj%10
        wmqj = wmqj//10
        if dmqj%2==1:
            menmqj = dmqj
            swmqj = 1
    wmqj=w1mqj; swmqj=0
    while wmqj!=0 and swmqj!=1:
        cdmqj = int(math.log(wmqj,10))+1
        dmqj = wmqj//10**(cdmqj-1)
        wmqj = wmqj % 10**(cdmqj-1)
        if dmqj%2==0:
            masmqj =dmqj
            swmqj = 1
    return

nmqj = int(input("intro n: "))
for imqj in range(nmqj):
    xmqj=int(input("intro x: "))
    masmenosmqj(xmqj)
    parmqj=masmqj; imparmqj=menmqj
    print("\n",parmqj,", ",imparmqj)            