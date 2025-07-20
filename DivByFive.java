//Write a program to accept a number from user and print if it is divisible by 5 .

import java.util.Scanner;

public class DivByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%5==0)
        {
            System.out.println("Divisible By 5");
        }
        else
        {
            System.out.println("Not Divisible By 5");
        }
    
    }
    
}
