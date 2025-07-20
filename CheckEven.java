/*Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method.
 */

import java.util.Scanner;

public class CheckEven {
    public static boolean isEven(int a)
    {
        return a % 2 == 0;
    }
    public static void main(String[] args) {
        System.out.print("enter a num : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       if(isEven(num))
       {
        System.out.println("Num is even");
       }
       else
       {
        System.out.println("Num is odd");
       }
    }
    
}
