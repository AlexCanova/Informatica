package es2pigreco;

import java.util.Scanner;


public class Es2Pigreco {

    public static void main(String[] args) {
      double piGreco = 4; 
      double piPrec = 0;
      double prec;
      double termine = 0;
      long denom = 3;
      boolean daSommare = false;
      
      Scanner tastiera = new Scanner (System.in);
        System.out.print("Inserisci la precisione: ");
        prec = tastiera.nextDouble();
        do{
           termine = 4.0d / denom;
           piPrec = piGreco;
           if (daSommare) {
               piGreco += termine;
           } else {
               piGreco -= termine;
           }
           denom += 2;
           daSommare = !daSommare;
        } while (Math.abs(piGreco - piPrec) > prec);
        System.out.println("piGreco = " +piGreco );
    
    }
}
