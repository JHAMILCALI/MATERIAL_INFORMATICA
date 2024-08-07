#6. Determinar el color de la naranja en 3 intentos, recursivamente
def jugarmqj(intentomqj=1):
    respuestamqj = input("¿De qiue color es una naranja?")
    if respuestamqj != "naranja":
        if intentomqj < 3:
            print("\nFallaste! Intentalo de nuevo")
            intentomqj += 1
            jugarmqj(intentomqj)
        else:
            print ("\nPerdiste!")
    else:
        print("\nGanaste!")
jugarmqj()
            