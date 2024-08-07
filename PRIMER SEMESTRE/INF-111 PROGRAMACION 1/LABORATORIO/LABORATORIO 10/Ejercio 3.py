#3. Dada unba cadena, elimina las consonantes de las palabra pare
def esvocalmqj(wmqj):
    kmqj=0
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
def sinconsomqj(wmqj):
    vmqj=""
    elemqj = len(wmqj)
    for imqj in range(1,elemqj+1):
        ymqj = wmqj[imqj-1:imqj]
        if esvocalmqj(ymqj)== 1:
            vmqj = vmqj + ymqj
    return vmqj
bmqj=input("intro frase ")
cpmqj=contarpalmqj(bmqj)
vmqj=""; palmqj="" 
for imqj in range(1,cpmqj+1):
    palmqj = sacarpalmqj(bmqj,imqj)
    if imqj%2==0:
        palmqj = sinconsomqj(palmqj)
    vmqj = vmqj + palmqj +" "
print(vmqj)