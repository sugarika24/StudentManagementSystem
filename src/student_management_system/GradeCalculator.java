package student_management_system;

public class GradeCalculator {
    public static void main(String[] args) {
        int marks = 85; 
        String grade;

        if (marks >= 90 && marks <= 100) {
            grade = "A+";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else if (marks >= 50) {
            grade = "D";
        } else if (marks >= 0) {
            grade = "F";
        } else {
            grade = "Invalid marks entered.";
        }

        if (marks >= 0 && marks <= 100) {
            System.out.println("Marks: " + marks);
            System.out.println("Your grade is: " + grade);
        } else {
            System.out.println(grade);
        }
    }
}
