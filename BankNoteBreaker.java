/*Write a program to read an amount (integer value) and break the amount into the smallpossible number of bank notes 500,200,100,50,20,10,5,2,1.
 */

import java.util.Scanner;

public class BankNoteBreaker {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount : ");
        int amount = sc.nextInt();
        
        int count500 = amount / 500;
        amount = amount % 500;

         int count200 = amount / 200;
        amount = amount % 200;

         int count100 = amount / 100;
        amount = amount % 100;

        int count50 = amount / 50;
        amount = amount % 50;

        int count20 = amount / 20;
        amount = amount % 20;

        int count10 = amount / 10;
        amount = amount % 10;

        int count5 = amount / 5;
        amount = amount % 5;

        int count2 = amount / 2;
        amount = amount % 2;

        int count1 = amount / 1;
        amount = amount % 1;

          System.out.println("Minimum number of notes : 456");
      
        if(count500 > 0 )
        {
            System.out.println("500 X " + count500);
        }
          if(count200 > 0 )
        {
            System.out.println("200 X " + count200);
        }
          if(count100 > 0 )
        {
            System.out.println("100 X " + count200);
        }
          if(count50 > 0 )
        {
            System.out.println("50 X " + count50);
        }
          if(count20 > 0 )
        {
            System.out.println("20 X " + count20);
        }
          if(count10 > 0 )
        {
            System.out.println("10 X " + count10);
        }
          if(count5 > 0 )
        {
            System.out.println("5 X " + count5);
        }
          if(count2 > 0 )
        {
            System.out.println("2 X " + count2);
        }
          if(count1 > 0 )
        {
            System.out.println("1 X " + count1);
        }


    }
}
