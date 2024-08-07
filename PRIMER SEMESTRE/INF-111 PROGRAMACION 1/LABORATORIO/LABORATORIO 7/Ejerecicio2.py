#2.Introduce valores hasta digitar el -1, enontra en el lote la serie de Fibonacci.
amqj=-1;bmqj=1;dmqj=amqj+bmqj
xmqj=int(input("intro x: "))
while xmqj!=-1:
    if xmqj==dmqj:
        print(xmqj)
        amqj=bmqj;bmqj=dmqj;dmqj=amqj+bmqj
    xmqj=int(input("intro x: "))