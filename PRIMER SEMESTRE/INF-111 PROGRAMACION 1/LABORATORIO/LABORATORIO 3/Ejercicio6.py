nmj=int(input("intro n: "))
amj=int(input("intro a: "))
bmj=int(input("intro b: "))
tmj=amj; pmj=1; zmj=amj+bmj 
for imj in range(1,nmj+1):
    print(tmj,end=", ")
    pmj = pmj + 1
    if pmj>tmj:
        tmj=zmj-tmj
        pmj=1