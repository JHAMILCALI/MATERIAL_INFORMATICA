#5. Resolver para n terminos 1+2+2+3+3+3+4+4+4+4+5+5+5+5+5...
def clasicamqj(wmqj):
    tmqj=1; pmqj=1
    for imqj in range(wmqj):
        kmqj = tmqj
        pmqj = pmqj + 1
        if pmqj>tmqj:
            tmqj=tmqj+1
            pmqj=1
    return kmqj
nmqj=int(input("intro n: "))
smqj=0
for imqj in range(1,nmqj+1):
    smqj = smqj + clasicamqj(imqj)
    print(clasicamqj(imqj),end=" + ")
print("=",smqj)