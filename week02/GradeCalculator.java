import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your marks (0 to 100): ");
        int marks = input.nextInt();

        String grade;
        if (marks < 0 || marks > 100) {
            grade = "Invalid";
        } else if (marks >= 80) {
            grade = "A+";
        } else if (marks >= 70) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else if (marks >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        if (grade.equals("Invalid")) {
            System.out.println("Marks must be between 0 and 100.");
        } else {
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + grade);
        }

        input.close();
    }
}
