nmj = int(input("intro n: "))
xmj = int(input("intro x: "))
smj=0; amj=-1; bmj=1; tmj=amj+bmj; pmj=1; t2mj=2
for imj in range(nmj):
    smj = smj+xmj**tmj/t2mj
    print(xmj,"^",tmj,"/", t2mj,end=" + ")
    amj=bmj; bmj=tmj; tmj=amj+bmj
    pmj = pmj + 1
    if pmj>t2mj:
        t2mj = t2mj+2; pmj=1
print("=",smj)