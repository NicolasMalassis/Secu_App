def Check(login):
    tab="                   azertyuiopqsdfghjklmwxcvbnAZERTYUIOPQSDFGHJKLMWXCVBN0123456789_$&#@"
    nblog=len(login)
    password="souris"
    nbpass=6
    sum=1
    n=max(nblog,nbpass)
    for i in range(0,n):
        index1=tab.index(login[i])+10
        index2=tab.index(password[i])+10
        sum+=(index1*n*(i+1))*(index2*(i+1)*(i+1))
    return sum





from itertools import chain, product

def bruteforce(charset,minlength, maxlength):
    return (''.join(candidate)
        for candidate in chain.from_iterable(product(charset, repeat=i)
        for i in range(minlength, maxlength + 1)))


def troisCons(mot):
    cmptCons = 0
    for i in range(0,len(mot)):
        c = mot[i]
        if(c != 'a' and c != 'e' and c != 'i' and c != 'o' and c != 'u' and c != 'y'):
            cmptCons+=1
        else:
            cmptCons=0
    if(cmptCons >= 3):
      return True
    return False

def resolv():
    checksum=3696619
    for attempt in bruteforce('abcdefghijklmnopqrstuvwxyz',6,8):
        sum=Check(attempt)
        if (sum==checksum):
            if(troisCons(attempt)):
                continue
            print(attempt)
    return(0)




