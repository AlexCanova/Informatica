package es1sommacifre;
import java.util.Scanner;
public class Es1SommaCifre {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner (System.in);
        int totCifre = 0;
        System.out.print("N = ");
        long numero = tastiera.nextLong();
        do{
            totCifre += numero%10;
            numero /= 10;
        } while (numero != 0);
        System.out.println("totale cifre =" +totCifre);
    }
    
}
