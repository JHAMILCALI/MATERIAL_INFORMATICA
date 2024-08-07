#7. Dado un numero, sacar el o los digitos centrales y ponerlos en los extermos.
import math
nmqj=int(input("intro n: "))
cdmqj=int(math.log10(nmqj))+1

if cdmqj%2==0:
    pmqj= (cdmqj//2)-1
else:
    pmqj= cdmqj//2
bmqj = nmqj%10**pmqj
nmqj = nmqj//10**pmqj
if cdmqj%2==0:
    cmqj=nmqj%100
    amqj=nmqj//100
    d1mqj= cmqj//10
    d2mqj= cmqj%10
else:
    cmqj=nmqj%10
    amqj=nmqj//10
    d1mqj=cmqj
    d2mqj=cmqj
ymqj = (d1mqj*10**pmqj + amqj)*10**pmqj + bmqj
ymqj = ymqj*10+d2mqj
print(ymqj)    
    