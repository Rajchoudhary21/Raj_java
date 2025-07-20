//Write a Java method to compute the average of three numbers..

import java.util.Scanner;

public class ThreeNumAverage {
    public static float average3Num(int a,int b,int c)
    {
        int sum = a+b+c;
        return sum/3;
    }
    public static void main(String[] args) {
        System.out.print("enter 3 numbers : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("Three Number Average : "+ average3Num(num1, num2, num3));        
    }
    
}
