import java.util.ArrayList;

public class GradeTracker {

    ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(String name, int marks) {

        Student s = new Student(name, marks);

        students.add(s);

        System.out.println("Student Added Successfully.");
    }

    // Display Students
    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n----------- Student Report -----------");

        for (int i = 0; i < students.size(); i++) {

            Student s = students.get(i);

            System.out.println("Name  : " + s.name);
            System.out.println("Marks : " + s.marks);
            System.out.println("Grade : " + getGrade(s.marks));
            System.out.println("--------------------------------------");
        }
    }

    // Highest Marks
    public void highestMarks() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        Student highest = students.get(0);

        for (int i = 1; i < students.size(); i++) {

            if (students.get(i).marks > highest.marks) {
                highest = students.get(i);
            }
        }

        System.out.println("\nHighest Marks");
        System.out.println("Name  : " + highest.name);
        System.out.println("Marks : " + highest.marks);
        System.out.println("Grade : " + getGrade(highest.marks));
    }

    // Lowest Marks
    public void lowestMarks() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        Student lowest = students.get(0);

        for (int i = 1; i < students.size(); i++) {

            if (students.get(i).marks < lowest.marks) {
                lowest = students.get(i);
            }
        }

        System.out.println("\nLowest Marks");
        System.out.println("Name  : " + lowest.name);
        System.out.println("Marks : " + lowest.marks);
        System.out.println("Grade : " + getGrade(lowest.marks));
    }

    // Average Marks
    public void averageMarks() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        int sum = 0;

        for (int i = 0; i < students.size(); i++) {
            sum += students.get(i).marks;
        }

        double average = (double) sum / students.size();

        System.out.printf("\nAverage Marks : %.2f\n", average);
    }

    // Grade Calculation
    public String getGrade(int marks) {

        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}