import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GradeTracker tracker = new GradeTracker();

        while (true) {

            System.out.println("\n===== Student Grade Tracker =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Highest Marks");
            System.out.println("4. Lowest Marks");
            System.out.println("5. Average Marks");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks : ");
                    int marks = sc.nextInt();

                    tracker.addStudent(name, marks);

                    break;

                case 2:

                    tracker.displayStudents();

                    break;

                case 3:

                    tracker.highestMarks();

                    break;

                case 4:

                    tracker.lowestMarks();

                    break;

                case 5:

                    tracker.averageMarks();

                    break;

                case 6:

                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}