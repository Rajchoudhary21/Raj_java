//⦁ Wap to swap any two numbers using third variable.

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("a = ");
          int a = sc.nextInt() ;
        System.out.print
        ("b = ");
       int b = sc.nextInt();
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
    
}
