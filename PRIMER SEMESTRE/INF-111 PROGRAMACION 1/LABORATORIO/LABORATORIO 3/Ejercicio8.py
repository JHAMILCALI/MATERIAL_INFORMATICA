nmj=int(input("intro n: "))
amj=-1; bmj=1; tmj=amj+bmj
for imj in range(1,nmj+1):
    print(tmj,end=", ")
    amj=bmj; bmj=tmj
    tmj = amj+bmj