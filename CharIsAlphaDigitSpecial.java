// Write a program to check whether a character is an alphabet, digit or special character.

import java.util.*;

public class CharIsAlphaDigitSpecial {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch <= 9 && ch >= 0)
        {
            System.out.println("It is Digit...");
        }
        else if(ch <= 'z' && ch >= 'a' || ch <= 'Z' && ch >= 'A' )
        {
             System.out.println("It is Alphabet...");
        }
        else
        {
             System.out.println("It is Special character...");
        }
    }
    
}
