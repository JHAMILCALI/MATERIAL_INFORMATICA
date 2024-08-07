#8. Dado un numero, cambiar el digito par menor por el digito impar mayor.
nmqj=int(input("intro n: "))
ymqj=0; pomqj=1; m1mqj=0; m2mqj=9; xmqj=nmqj
while nmqj!=0:
    dmqj=nmqj%10
    nmqj=nmqj//10
    if dmqj%2==0:
        if dmqj<m2mqj:
            m2mqj=dmqj
    else:
        if dmqj>m1mqj:
            m1mqj=dmqj
while xmqj!=0:
    dmqj=xmqj%10
    xmqj=xmqj//10
    if dmqj%2==0:
        if dmqj==m2mqj:
            dmqj=m1mqj
    else:
        if dmqj==m1mqj:
            dmqj=m2mqj
    ymqj=dmqj*pomqj+ymqj
    pomqj=pomqj*10
print("=",ymqj)

