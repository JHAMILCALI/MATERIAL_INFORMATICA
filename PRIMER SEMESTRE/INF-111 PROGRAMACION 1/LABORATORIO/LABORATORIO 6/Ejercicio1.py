#1. Un numeo entero positivo puede descomponerse de derecha a izquirda.
nmqj=int(input("intro n: "))

while nmqj!=0:
    dmqj=nmqj%10
    nmqj=nmqj//10
    print(dmqj)