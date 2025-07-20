/*
⦁ Wap to print Fibonacci series. 
 */

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//7
        int i,a=0,b=1;
        for(i=0;i<num;i++)
        {
            System.out.println(a);//0 +1+1+2+3+5+
            int c = a;
            a = b;
            b = c+b;
            


        }

    }
    
}
