nmj = int(input("intro n: "))
kmj = int(input("intro k: "))
if nmj==kmj:
    amj=kmj*2
    bmj=amj+kmj
else:
    if nmj<kmj:
        amj=kmj
        bmj=amj+kmj
    else:
        if nmj%kmj==0:
            amj=nmj-kmj
            bmj=nmj+kmj
        else:
            rmj=nmj%kmj
            amj=nmj-rmj
            bmj=amj+kmj
print(amj,bmj)