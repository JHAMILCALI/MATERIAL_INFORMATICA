amj=int(input("intro a: "))
bmj=int(input("intro b: "))
cmj=int(input("intro c: "))
if amj<bmj:
    menmj=amj
else:
    menmj=bmj
    if cmj<menmj:
        menmj=cmj
print("men=", menmj)