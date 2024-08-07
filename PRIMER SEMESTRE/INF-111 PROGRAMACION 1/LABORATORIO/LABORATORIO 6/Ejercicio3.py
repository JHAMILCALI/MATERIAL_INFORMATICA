#3. Se puede realizar la composion de digitos a la derecha.
nmqj = int(input("intro n: "))
ymqj=0
for imqj in range(nmqj):
    dmqj =  int(input("intro d (DIGITO) "))
    ymqj = ymqj*10+dmqj
print("y=",ymqj)