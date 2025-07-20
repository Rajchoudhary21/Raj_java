/*Write a program to find the factorial of any number entered by the user.
 */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long i,fact = 1;
        for(i=1;i<=num;i++)
        {
            fact = i * fact;
        }
        System.out.println("Factorial of "+num+" number : " + fact);

    }
    
}
