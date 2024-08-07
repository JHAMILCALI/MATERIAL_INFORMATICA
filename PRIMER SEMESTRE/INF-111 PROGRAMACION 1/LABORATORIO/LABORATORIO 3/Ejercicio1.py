nmj=int(input("intro n: "))
tmj=0
for imj in range(1,nmj+1):
    print(tmj, end=", ")
    if imj%2==0:
        tmj=1-tmj