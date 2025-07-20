/* Write a Java program to input week number(1-7) and print day of week name
using switch case.
 */

import java.util.Scanner;

public class WeekNameByNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day)
    {
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 13: System.out.println("wednusday");
            break;
            case 4: System.out.println("thursday");
            break;
            case 5: System.out.println("friday");
            break;
            case 6: System.out.println("saturday");
            break;
            case 7: System.out.println("sunday");
            break;
            default: System.out.println("enter 1 to 7 only(week 7days)");
            break;
    }
    }
    
}
