import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> grades = new ArrayList<>();

        // Step 1: Input data
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            names.add(name);

            System.out.print("Enter grade for " + name + ": ");
            int grade = sc.nextInt();
            sc.nextLine(); // consume newline
            grades.add(grade);
        }

        // Step 2: Calculate average, highest, lowest
        int sum = 0;
        int highest = grades.get(0);
        int lowest = grades.get(0);

        for (int grade : grades) {
            sum += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = (double) sum / n;

        // Step 3: Display summary
        System.out.println("\n--- Student Grades ---");
        for (int i = 0; i < n; i++) {
            System.out.println(names.get(i) + " : " + grades.get(i));
        }

        System.out.println("\nAverage Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

        sc.close();
    }
}

