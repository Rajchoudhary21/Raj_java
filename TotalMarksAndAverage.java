//Write a program to accept roll no and marks of 3 subjects of a student, Calculate total ofsubjects and average .

import java.util.Scanner;

public class TotalMarksAndAverage {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No : ");
        int rollNo = sc.nextInt();
         System.out.print("Enter Three subjects marks  : ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int totalMarks = sub1 + sub2 + sub3;
        int average = totalMarks/3;
        System.out.println("Total marks : "+totalMarks);
        System.out.println("Average : "+average);



    }
    
}
