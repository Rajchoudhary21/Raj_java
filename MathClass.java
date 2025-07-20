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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("enter num2 : ");
        int num2 = sc.nextInt();

        System.out.println(minOfTwo(num1, num2)+" is small...");


        
    }
    
}
