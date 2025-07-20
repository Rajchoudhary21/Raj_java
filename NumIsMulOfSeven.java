// 6. Write a program to accept a number from user and print if it is multiple of 7 .

import java.util.Scanner;

public class NumIsMulOfSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
          if(num%7==0)
        {
            System.out.println("Multiple By 7");
        }
        else
        {
            System.out.println("Not Multiple By 7");
        }
    
    }
    
}
