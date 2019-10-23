
package equazionesecondogrado;

import java.util.Scanner;

public class EquazioneSecondoGrado {

    public static void main(String[] args) {
    
        //coefficienti dell'equazione
        double a;
        double b;
        double c;
        double delta;
        double x1;
        double x2;
        Scanner tastiera =  new Scanner (System.in);
      //lettura dei coefficienti
        System.out.println("Soluzione dell'equazione di secondo grado");
        System.out.print("a = ");
        a = tastiera.nextDouble();    
        System.out.print("b = ");
        b = tastiera.nextDouble();
        System.out.print("c = ");
        c = tastiera.nextDouble();
       
        
        delta = b * b - 4 * a * c;
        
        if (delta<0) {
            System.out.println("L'equazione non ha soluzioni in R");
        } else if (delta == 0)  {
            x1 = (-b - Math sqrt(delta)) /2 * a;
            
            System.out.println("L'equazione ha due soluzioni coincidenti" + x1);
            
            System.out.println("L'equazione ha due soluzioni distinte:\n x1:" + x1+ "\n x2: " + x2);
        }
    
    }
    
}
