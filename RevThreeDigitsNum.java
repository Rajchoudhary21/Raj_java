//Wap to print any three digit number in reverse order.
import java.util.*;
public class RevThreeDigitsNum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three digits num : ");
        int num = sc.nextInt();
        int rev = 0, rem = 0;
        rev = rev * 10 + (num%10); 
        num = num/10;
        rev = rev * 10 + (num%10); 
        num = num/10;
        rev = rev * 10 + (num%10); 
        num = num/10;
        System.out.println("Reverse = "+ rev);

    }
}
