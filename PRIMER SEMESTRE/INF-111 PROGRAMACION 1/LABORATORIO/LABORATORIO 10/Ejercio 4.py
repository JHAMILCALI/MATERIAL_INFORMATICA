#4.Dada una cadena, cambiar la k-esima palabra, por la misma, peo con la primera y ultima vocal eliminada.
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
def contarvocmqj(wmqj):
    cmqj=0
    elemqj = len(wmqj)
    for imqj in range(1,elemqj+1):
        ymqj = wmqj[imqj-1:imqj]
        if esvocalmqj(ymqj)==1:
            cmqj=cmqj+1
    return cmqj
def elivocmqj(wmqj,kmqj):
    cmqj=0;vmqj=""
    elemqj = len(wmqj)
    for imqj in range(1,elemqj+1):
        ymqj = wmqj[imqj-1:imqj]
        if esvocalmqj(ymqj)==1:
            cmqj=cmqj+1
            if cmqj==kmqj:
                ymqj=""
        vmqj = vmqj + ymqj
    return vmqj
bmqj=input("intro frase ")
kmqj=int(input("intro k "))

cpmqj=contarpalmqj(bmqj)
wmqj=""
for imqj in range(1,cpmqj+1):
    palmqj = sacarpalmqj(bmqj, imqj)
    if imqj==kmqj:
        cvmqj = contarvocmqj(palmqj)
        palmqj = elivocmqj(palmqj,cvmqj)
        palmqj = elivocmqj(palmqj,1)
    wmqj = wmqj + palmqj + " "
print("\n Nueva ; ",wmqj)
        