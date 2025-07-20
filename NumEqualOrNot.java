//Write a program to accept two integers and check whether they are equal or not.

import java.util.Scanner;

public class NumEqualOrNot {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 == num2)
        {
            System.out.println("Both are equal...");
        }
        else 
        {
            System.out.println("Not equal...");
        }
    }
}
