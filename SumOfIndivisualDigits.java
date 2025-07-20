//Wap to find sum of individuals digits of any three digits number
import java.util.*;
public class SumOfIndivisualDigits {
           public static void main(String args[])
           {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a three digit number : ");
            int num = sc.nextInt();//123
            int sum = 0,rem=0;
            rem = num%10;//3
            sum = sum + rem;//3
            num = num / 10;//12
            rem = num%10;//2
            sum = sum + rem;//5
            num = num / 10;//1
            rem = num%10;//1
            sum = sum + rem;//6
            num = num / 10;//0
            System.out.println("Sum Of Three Individual Digits = "+ sum);



           }     
}
