//Write a program to read the age of a candidate and determine whether he is eligible to cahis/her own vote

import java.util.Scanner;

public class EligibleOrNotForVote {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("your are eligible for vote...");
        }
        else{
             System.out.println("your are not eligible for vote...");
        }

    }
}
