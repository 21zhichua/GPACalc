import java.util.Objects;
import java.util.Scanner;
public class GPACalculator {
    private double numOfPeriods;
    private String grades;

    private double totalGrade;

    public GPACalculator(double numOfPeriods, String grades) {
        this.numOfPeriods = numOfPeriods;
        this.grades = grades;
    }
    public double breakdownString(double totalGrade) {
        for (int i = 0; i <= numOfPeriods; i++) {
            if (Objects.equals(grades.charAt(i), 'A')) {
                totalGrade += 4.0;
            }
            else if (Objects.equals(grades.charAt(i), 'B')) {
                totalGrade += 3.0;
            }
            else if (Objects.equals(grades.charAt(i), 'C')) {
                totalGrade += 2.0;
            }
            else if (Objects.equals(grades.charAt(i), 'D')) {
                totalGrade += 1.0;
            }
            else if (Objects.equals(grades.charAt(i), 'F')) {
                totalGrade += 0.0;
            }
            else {
                totalGrade += 0.0;
            }

        }
        return totalGrade;
    }
    public double calculateGPA(double GPA) {
        GPA = totalGrade / numOfPeriods;
        return GPA;
    }


    public static void main(String args[]) {
        double newPeriods;
        String newGrades;
        double newTotal = 0;
        double newResult = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number of periods: ");
        newPeriods = input.nextDouble();
        System.out.print("Enter your grades (A,B,C,F,A,B): ");
        newGrades = input.next();
        GPACalculator newGPA = new GPACalculator(newPeriods, newGrades);
        newGPA.breakdownString(newTotal);
        System.out.println(newGPA.calculateGPA(newResult));
    }
}
