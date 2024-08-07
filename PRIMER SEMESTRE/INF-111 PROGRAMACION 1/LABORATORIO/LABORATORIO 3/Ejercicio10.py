nmj=int(input("imtro n: "))
tmj=1; pmj=1; kmj=0
for i in range(1,nmj+1):
    kmj=kmj+tmj
    print(kmj,end=", ")
    pmj = pmj + 1
    if pmj>tmj:
        tmj=tmj+1
        pmj=1