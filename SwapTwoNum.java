//Wap to swap any two numbers without using third variable.

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
         a = a*b;//6
        b = a/b;//2
        a = a/b;//3
       
        System.out.println("a = "+a);
        System.out.println("b = "+b);


    }
}
