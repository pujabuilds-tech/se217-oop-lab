import java.util.Scanner;

public class GradeCalculator {

    // Else-if ladder: the first true condition wins, so go from high to low
    static String letterGrade(double marks) {
        if (marks >= 80) {
            return "A+";
        } else if (marks >= 75) {
            return "A";
        } else if (marks >= 70) {
            return "A-";
        } else if (marks >= 65) {
            return "B+";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 55) {
            return "B-";
        } else if (marks >= 50) {
            return "C+";
        } else if (marks >= 45) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    // Grade point for the same ranges (edit the numbers to match your own scale)
    static double gradePoint(double marks) {
        if (marks >= 80) return 4.00;
        else if (marks >= 75) return 3.75;
        else if (marks >= 70) return 3.50;
        else if (marks >= 65) return 3.25;
        else if (marks >= 60) return 3.00;
        else if (marks >= 55) return 2.75;
        else if (marks >= 50) return 2.50;
        else if (marks >= 45) return 2.25;
        else if (marks >= 40) return 2.00;
        else return 0.00;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Example 1: grade for marks typed by the user
        System.out.print("Enter your marks (0 to 100): ");
        double marks = input.nextDouble();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else {
            System.out.println("Grade: " + letterGrade(marks));
            System.out.println("Grade point: " + gradePoint(marks));

            // Example 2: pass or fail remark
            if (marks >= 40) {
                System.out.println("Remark: Passed");
            } else {
                System.out.println("Remark: Failed, try again next time");
            }
        }

        // Example 3: table of sample marks
        System.out.println("--- Sample marks table ---");
        double[] sample = {92, 77.5, 68, 51, 43, 30};
        for (int i = 0; i < sample.length; i++) {
            System.out.printf("%6.1f -> %-2s (%.2f)%n", sample[i], letterGrade(sample[i]), gradePoint(sample[i]));
        }

        // Example 4: count how many sample marks passed
        int passed = 0;
        for (int i = 0; i < sample.length; i++) {
            if (sample[i] >= 40) {
                passed++;
            }
        }
        System.out.println(passed + " out of " + sample.length + " sample students passed");

        input.close();
    }
}
