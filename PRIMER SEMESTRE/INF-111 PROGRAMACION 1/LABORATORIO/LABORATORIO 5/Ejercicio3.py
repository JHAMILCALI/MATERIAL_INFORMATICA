nmj = int(input("intro n: "))
xmj = int(input("intro x: "))
smj=0; tmj = 1;  pmj = 1
for imj in range(nmj):
    smj= smj+xmj**tmj
    print(xmj,"^",tmj,end=" + ")
    pmj = pmj + 1
    if pmj>tmj:
        tmj = tmj+1; pmj=1
print("=",smj)