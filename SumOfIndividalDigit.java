//Write a Java method to compute the sum of the digits in an integer

import java.util.Scanner;

public class SumOfIndividalDigit {
    
    public static int sumOfDigits(int a)
    {
        int sum = 0;
        while(a!=0)
        {
            int rem = a % 10;
            sum = sum + rem;
            a = a/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.print("enter a num : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("sum = "+sumOfDigits(num));
        
    }
}
