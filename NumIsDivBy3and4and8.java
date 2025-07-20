//Wap to check given number is divisible by 3, 4 and 8 or not.

import java.util.Scanner;

public class NumIsDivBy3and4and8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%3 == 0 && num%4 == 0 && num%8 == 0)
        {
            System.out.println("num is divisible by 3,4 and 8");
        }
        else if(num%3 == 0 && num%4 == 0 )
        {
             System.out.println("num is divisible by 3,4");
        }
        else if(num%4 == 0 && num%8 == 0)
        {
            System.out.println("num is divisible by 4 and 8");
        }
        else if(num%3 == 0 &&  num%8 == 0)
        {
            System.out.println("num is divisible by 3 and 8");
        }
        else  if(num%3 == 0)
        {
            System.out.println("num is divisible by 3");
        }
        else  if(num%4 == 0)
        {
            System.out.println("num is divisible by 4");
        }
        else   if(num%8 == 0)
        {
            System.out.println("num is divisible by 8");
        }
        else {
            System.out.println("num is not divisible by 3,4 and 8");
        }

    }
}
