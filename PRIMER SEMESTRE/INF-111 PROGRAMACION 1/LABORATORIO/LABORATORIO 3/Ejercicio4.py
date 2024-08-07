nmj=int(input("intro n: "))
tmj=1; pmj=1
for imj in range(1,nmj+1):
    print(tmj, end=", ")
    pmj = pmj + 1
    if pmj>tmj:
        tmj=tmj+1
        pmj=1