nmj=int(input("intro n: "))
tmj=2; pmj=1; zmj=2+5
for imj in range(1,nmj+1):
    print(tmj,end=", ")
    pmj = pmj + 1
    if pmj>tmj:
        tmj=zmj-tmj
        pmj=1
        