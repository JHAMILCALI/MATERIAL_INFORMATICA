nmj=int(input("intro n: "))
kmj=int(input("intro k: "))
amj=int(input("intro n: "))
bmj=int(input("intro k: "))
tmj=amj; cmj=amj+bmj
for imj in range(1,nmj+1):
    print(tmj, end=", ")
    if imj%kmj==0:
        tmj=cmj-tmj