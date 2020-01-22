package e3menuvettore;
import java.util.Scanner;
public class E3MenuVettore {
    
    public static void main(String[] args){
     /*double[] v;
        v = new double [10];
        v [0] = 1.5;
        v [1] = 3.0;
        v [2] = 4.5;
        v [3] = 3.0;
        
        double [] y = new double[10];
        y [0] = 1.5;*/
        
        double [] z= {1.3, 3.0, 4.5, 3.0, 0.0, 0.0, 0.0, 0.0,};
        Scanner tastiera = new Scanner (System.in);
        String scelta;
        do{
            System.out.println("0-Uscita");
            System.out.println("1-Visualizza vettore");
            System.out.println("2-Leggi nuovo valore");
            System.out.println("3-Visualizza media");
            System.out.println("4-Visualizza i valori maggiori della media");
            System.out.print("Scelta: ");
            scelta = tastiera.nextLine();
            
            if (scelta.equals("1")) {
                System.out.println("Hai scelto 1");
            }
        } while (!scelta.equals("0"));
    }
    
}
