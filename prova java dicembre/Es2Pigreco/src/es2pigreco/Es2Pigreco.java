package es2pigreco;

import java.util.Scanner;


public class Es2Pigreco {

    public static void main(String[] args) {
      double piGreco = 0; 
      double piPrec = 0;
      double prec = 0;
      double termine = 0;
      long denom = 0;
      
      Scanner tastiera = new Scanner (System.in);
        System.out.println("Inserisci la precisione: ");
        prec = tastiera.nextDouble();
        do{
    } while (Math.abs(piGreco - piPrec) > prec);
    
}
