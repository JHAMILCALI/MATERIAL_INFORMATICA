nmj = int(input("intro n: "))
xmj = int(input("intro x: "))
smj=0
for imj in range(nmj):
    smj=smj+xmj**(imj+1)
    print(xmj,"^",imj+1,end=" + ")
    print(" = ",smj)