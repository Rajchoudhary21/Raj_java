import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of students : ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        int[] grades = new int[n];

        for(int i = 0; i<n;i++)
        {
            System.out.print("Enter Student name : ");
            String name = sc.nextLine();
            names[i] = name;

            System.out.print("Enter student grade : ");
            int grade = sc.nextInt();
            grades[i] = grade;
            sc.nextLine();

        }

        int sum = 0;
        int highest = grades[0];
        int lowest = grades[0];

        for(int i=0;i<n;i++)
        {
            sum = sum + grades[i];

            if(highest < grades[i])
            {
                highest = grades[i];
            }
            if(lowest > grades[i])
            {
                lowest = grades[i];
            }
        }

        System.err.println("Average = "+sum/n);
        System.out.println("highest = "+highest);
        System.out.println("lowest = "+lowest);
    }
    
}
