nmj = int(input("intro n: "))
xmj = int(input("intro x: "))
smj=0; amj=-1; bmj=1; tmj=amj+bmj; sigmj=1
for imj in range(nmj):
    smj = smj+sigmj*(xmj**tmj/((imj+1)*2))
    print(sigmj,"*",xmj,"^",tmj,"/",(imj+1)*2,end=" + ")
    amj=bmj; bmj=tmj; tmj=amj+bmj
    if (imj+1)%2==0:
        sigmj=sigmj*(-1)
print("=",smj)