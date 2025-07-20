/*Write a Java program to check if a number is a palindrome in Java? ( 121 is a
palindrome, 321 is not)
A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
palindrome because the reverse of 321 is 123, which is not equal to 321.
 */

import java.util.Scanner;

public class PalindromeNumber {
    public static int isPalindrome(int a)
    {
         int rev=0;
        while(a!=0){
            int rem = a % 10;
            rev = rev * 10 + rem;
            a = a/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.print("enter a num : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPalindrome(num)==num)
        {
            System.out.println("Num is palindrome");
        }
        else
        {
            System.out.println("Num is not palindrome ");
        }
        
    }
    
}
