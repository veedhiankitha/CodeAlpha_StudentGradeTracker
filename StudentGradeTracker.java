mport java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] marks = new int[n];

        int total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        String highestStudent = "";
        String lowestStudent = "";

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Marks (0-100): ");
            marks[i] = sc.nextInt();
            sc.nextLine();

            total += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
                highestStudent = names[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
                lowestStudent = names[i];
            }
        }

        double average = (double) total / n;

        System.out.println("\n========== STUDENT REPORT ==========");
        System.out.printf("%-15s %s\n", "Student Name", "Marks");
        System.out.println("------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-15s %d\n", names[i], marks[i]);
        }

        System.out.println("------------------------------------");
        System.out.printf("Average Marks : %.2f\n", average);
        System.out.println("Highest Marks : " + highest + " (" + highestStudent + ")");
        System.out.println("Lowest Marks  : " + lowest + " (" + lowestStudent + ")");

        sc.close();
    }
}
