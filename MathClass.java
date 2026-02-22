/*Search about(Google) & use the following methods of the Math class in Java:
a. Math.min( )
b. Math.max( )
c. Math.sqrt( )
d. Math.pow( )
e. Math.avg( )
f. Math.abs( )
 */

import java.util.Scanner;

public class MathClass {
    public static  int minOfTwo(int a,int b)
    {
        return Math.min(a,b);
    }
     public static  int maxOfTwo(int a,int b)
    {
        return Math.max(a,b);
    }
     public static  int squareRoot(int a)
    {
        return (int)Math.sqrt(a);
    }
     public static  int power(int a)
    {
        return (int)Math.pow(a,2);
    }
     public static  int absolute(int a)
    {
        return Math.abs(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("enter num2 : ");
        int num2 = sc.nextInt();

        System.out.println(minOfTwo(num1, num2)+" is small...");
        System.out.println(maxOfTwo(num1, num2)+" is Greatest...");
        System.out.println(squareRoot(num1)+" is Square root of "+num1);
        System.out.println(power(num1)+" is power 2 value of "+num1);
        System.out.println("Absolute value : "+absolute(num2));


        
    }
    
}
