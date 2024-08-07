#6. Dado un numero formar dos nuemros con los digitos pares y otro con los digitos impares.
import math
nmqj=int(input("intro n: "))
cdmqj=int(math.log10(nmqj))+1
amqj=0;bmqj=0
while nmqj!=0:
    dmqj=nmqj//10**(cdmqj-1)
    nmqj=nmqj%10**(cdmqj-1)
    cdmqj=cdmqj-1
    if dmqj%2==0:
        amqj=amqj*10+dmqj
    else:
        bmqj=bmqj*10+dmqj
print("a=",amqj,"b=",bmqj)