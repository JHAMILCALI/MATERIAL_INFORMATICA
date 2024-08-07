nmj=int(input("intro n: "))
cmj=0; kmj=2; pmj=2
while cmj<=nmj:
    if pmj%kmj!=0 and kmj<=pmj//2:
        kmj=kmj+1
    else:
        if kmj>pmj//2:
            print(pmj,end=", ")
            cmj=cmj+1
        pmj = pmj + 1
        kmj=2