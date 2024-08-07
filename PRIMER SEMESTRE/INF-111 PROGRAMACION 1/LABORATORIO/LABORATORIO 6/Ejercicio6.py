#6. Dado un numero eliminar el digito que ocupa la unudad de mil.
nmqj=int(input("intro n: "))
cmqj=0;ymqj=0;pomqj=1
while nmqj!=0:
    dmqj=nmqj%10
    nmqj=nmqj//10
    cmqj=cmqj+1
    if cmqj!=4:
        ymqj=dmqj*pomqj+ymqj
        pomqj=pomqj*10
print("y=",ymqj)
