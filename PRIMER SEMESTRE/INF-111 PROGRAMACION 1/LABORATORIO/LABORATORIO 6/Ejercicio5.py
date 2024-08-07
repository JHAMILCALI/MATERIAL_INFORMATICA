#5. Dado un numero encontra el digito mayor y el digito menor.
nmqj=int(input("intro n: "))
maymqj=0;menmqj=9
while nmqj!=0:
    dmqj=nmqj%10
    nmqj=nmqj//10
    if dmqj>maymqj:
        maymqj=dmqj
    if dmqj<menmqj:
        menmqj=dmqj
print("may=",maymqj,"men=",menmqj)