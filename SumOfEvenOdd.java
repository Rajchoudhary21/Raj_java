/*Write a program that reads a set of integers, and then prints the sum of the
even and odd integers.
 */
import java.util.*;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1,rem = 0;
        int sum1= 0;
          int sum2 = 0;
        for(i=0;i<num;i++)
        {
            rem = num % 10;
            if(rem % 2 == 0)
            {
                
                sum1 = sum1 + rem;
                
            }
            else
            {
              
                sum2 = sum2 + rem;
            }
            num  = num/10;

        }
System.out.println("Sum of even : "+ sum1);
System.out.println("Sum of odd : "+ sum2);


    }
    
}
