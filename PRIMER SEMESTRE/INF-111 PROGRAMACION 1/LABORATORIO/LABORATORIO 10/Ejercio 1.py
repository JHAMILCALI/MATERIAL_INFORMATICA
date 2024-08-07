#1.dada una frase convertir a minusculas
bmqj=input("intro frase ")
elemqj = len(bmqj)
wmqj=""
for imqj in range(1,elemqj+1):
    ymqj = bmqj[imqj-1:imqj]
    if ymqj!=" ":
        amqj = ord(ymqj)
        a1mqj = amqj + 32
        xmqj = chr(a1mqj)
        ymqj=""; ymqj = ymqj + xmqj
    wmqj = wmqj + ymqj
print("\n ",wmqj)