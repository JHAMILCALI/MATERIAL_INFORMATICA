nmj=int(input("intro n: "))
amj=-1; bmj=1; tmj=amj+bmj; t2mj=1; p2mj=1
for imj in range(1,nmj+1):
    if imj%2==0:
        print(t2mj,end=", ")
        p2mj=p2mj+1
        if p2mj>t2mj:
            t2mj=t2mj+1;p2mj=1
    else:
        print(tmj,end=", ")
        amj=bmj; bmj=tmj
        tmj= amj+bmj
        