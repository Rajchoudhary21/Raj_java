/*Write a program that reads a set of integers, and then prints the sum of the
even and odd integers.
 */

import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers (Enter 0 to stop): ");
        int sumeven = 0,sumodd = 0;
        while(true)
        {
            
            int num = sc.nextInt();
            if(num == 0)
            {
                break;
            
            }
            if(num%2==0)
            {
                sumeven=sumeven+num;
            }
            else{
                sumodd=sumodd+num;
            }
            
        }
        System.out.println("Sum Of Even = "+ sumeven);
        System.out.println("Sum Of Odd = "+ sumodd);
}
}