nmj=int(input("intro n: "))
tmj=1; pmj=1; sigmj=1
for imj in range(1,nmj+1):
    print(tmj,end=", ")
    tmj = tmj + sigmj
    pmj = pmj + 1
    if pmj>4:
        sigmj=sigmj*(-1)
        pmj=1
