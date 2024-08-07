#4. Se puede raalizar la composion de digitos a la izquierda.
nmqj = int(input("intro n: "))
ymqj=0; pomqj=1
for imqj in range(nmqj):
    dmqj = int(input("intro d (DIGITO) "))
    ymqj = dmqj*pomqj+ymqj
    pomqj=pomqj*10
print("y",ymqj)