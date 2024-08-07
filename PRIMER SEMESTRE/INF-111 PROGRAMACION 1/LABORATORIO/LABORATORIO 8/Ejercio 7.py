#7.Las torres de hanoi, movimintos de forma recursiva
def moverTorremqj(alturamqj,origenmqj,destinomqj,intermediomqj):
    if alturamqj >=1:
        moverTorremqj(alturamqj-1,origenmqj,intermediomqj,destinomqj)
        moverDiscomqj(origenmqj,destinomqj)
        moverTorremqj(alturamqj-1,intermediomqj,destinomqj, origenmqj)
def moverDiscomqj(desdemqj,haciamqj):
    print("mover disco de",desdemqj,"a",haciamqj)
    
moverTorremqj(3, "A", "B","C")