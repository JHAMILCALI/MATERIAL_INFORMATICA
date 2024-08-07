nmj=int(input("intro n: "))
kmj=int(input("intro k: "))
tmj=0
for imj in range(1,nmj+1):
    print(tmj, end=", ")
    if imj%kmj==0:
        tmj=1-tmj