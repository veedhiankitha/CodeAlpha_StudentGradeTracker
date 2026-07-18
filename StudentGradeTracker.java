import java.util.*;
public class StudentGradeTracker{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] marks = new int[n];

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();

            total += marks[i];

            if (marks[i] > highest)
                highest = marks[i];

            if (marks[i] < lowest)
                lowest = marks[i];
        }

        double average = (double) total / n;

        System.out.println("\n===== Student Report =====");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " : " + marks[i]);
        }

        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}
    