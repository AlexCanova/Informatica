package mostraposcifre;


public class MostraPosCifre {

    public static void main(String[] args) {
    long num;
    long cifra;
    int indice = 0;
    
    long[] cifre = new long [10]; //array
    int lungCifre = 0;
    num=1247;
    
    while (num>0){
        cifra=num % 10;
        num /= 100;
        cifre[indice] = cifra;
        indice++;
    }
    lungCifre = indice;
    for(int c = 0; c < lungCifre; c++)
            System.out.println(cifre[c]);
    }
    
}
