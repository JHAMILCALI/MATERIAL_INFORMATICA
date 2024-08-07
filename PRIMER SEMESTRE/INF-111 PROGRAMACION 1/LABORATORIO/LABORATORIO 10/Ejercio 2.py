#2.dada una cadena ,cambiear las vocales por la siguirnte vocal, solo en las palabras
#etremas de la cadena
def esvocalmqj(wmqj):
    if wmqj=="a" or wmqj=="e" or wmqj=="i" or wmqj=="o" or wmqj=="u":
        kmqj=1
    return kmqj

def contarpalmqj(bmqj):
    bmqj=bmqj+" "
    cmqj=0
    elemqj = len(bmqj)
    for imqj in range(1,elemqj+1):
        ymqj = bmqj[imqj-1:imqj]
        if ymqj==" ":
            cmqj=cmqj+1
    return cmqj

def sacarpalmqj(bmqj, kmqj):
    bmqj=bmqj+" "
    cmqj=0; wmqj=""; vmqj=""
    elemqj = len(bmqj)
    for imqj in range(1,elemqj+1):
        ymqj = bmqj[imqj-1:imqj]
        if ymqj==" ":
            cmqj=cmqj+1
            if cmqj==kmqj:
                wmqj=vmqj
            vmqj=""
        else: vmqj=vmqj+ymqj
    return wmqj
def sgtevocmqj(bmqj):
    elemqj = len(bmqj)
    wmqj=""
    for imqj in range(1,elemqj+1):
        ymqj = bmqj[imqj-1:imqj]
        if ymqj=="a":
            ymqj="e"
        elif ymqj=="e":
            ymqj="i"
        elif ymqj=="i":
            ymqj="o"
        elif ymqj=="o":
            ymqj="u"
        elif ymqj=="u":
            ymqj="a"
        wmqj=wmqj+ymqj
    return wmqj

bmqj=input("intro frase ")
cpmqj=contarpalmqj(bmqj)
wmqj=""
for imqj in range(1,cpmqj+1):
    vmqj = sacarpalmqj(bmqj,imqj)
    if imqj==1 or imqj==cpmqj:
        vmqj = sgtevocmqj(vmqj)
    wmqj = wmqj + vmqj + " "
print("\n Nueva; ",wmqj)
    