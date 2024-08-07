#2. Un numero entero positivo tambien puede decomponer de izquierda a derecha.
import math
nmqj=int(input("intro n: "))
cdmqj=int(math.log10(nmqj))+1

print("cd=",cdmqj)
while nmqj!=0:
    dmqj=nmqj//10**(cdmqj-1)
    nmqj=nmqj%10**(cdmqj-1)
    cdmqj=cdmqj-1
    print("d=",dmqj)
