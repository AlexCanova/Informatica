package ternapitagorica;

import java.util.Scanner;

public class TernaPitagorica {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner tastiera = new Scanner(System.in);
        System.out.print("a = ");
        a = tastiera.nextInt();
        System.out.print("b = ");
        b = tastiera.nextInt();
        System.out.print("c = ");
        c = tastiera.nextInt();
        
        if (a*a+b*b==c*c){
            System.out.print("Questi numeri formanoo una terna pitagorica.");
        }
            else {
            System.out.print("Questi numeri non formano una terna pitagorica!");
        }
      2
    }

}
