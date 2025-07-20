//⦁ Wap to swap any three numbers using fourth variable

import java.util.Scanner;

public class SwapThreeNum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();
        int d;
        d = a;
        a = b;
        b = c;
        c = d;
         System.out.println("a = "+a);
          System.out.println("b = "+b);
           System.out.println("c = "+c);

    }
}