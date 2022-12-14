import java.util.Scanner;
public class GPACalculator {
    private double numOfPeriods;
    private String grades;

    double totalGrade;

    double classGrade;
    public GPACalculator(double numOfPeriods, String grades) {
        this.numOfPeriods = numOfPeriods;
        this.grades = grades;
    }
    public double breakdownString(double totalGrade, String grades, double classGrade) {
        for (int i = 0; i < numOfPeriods; i++) {
            if (grades.charAt(i) == 'A') {
                classGrade = 4.0;
                totalGrade += classGrade;
            }
            else if (grades.charAt(i) == 'B') {
                classGrade = 3.0;
                totalGrade += classGrade;
            }
            else if (grades.charAt(i) == 'C') {
                classGrade = 2.0;
                totalGrade += classGrade;
            }
            else if (grades.charAt(i) == 'D') {
                classGrade = 1.0;
                totalGrade += classGrade;
            }
            else if (grades.charAt(i) == 'F') {
                classGrade = 0.0;
                totalGrade += classGrade;
            }

        }
        return totalGrade;
    }
    public double calculateGPA(double totalGrade) {
        double GPA = 4.0 / 4.0;
        return GPA;
    }


    public static void main(String args[]) {
        double newPeriods;
        String newGrades;
        double newTotal = 0;
        double newResult = 0;
        double newClass = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number of periods: ");
        newPeriods = input.nextDouble();
        System.out.print("Enter your grades (A,B,C,F,A,B): ");
        newGrades = input.next();
        GPACalculator newGPA = new GPACalculator(newPeriods, newGrades);
        newGPA.breakdownString(newTotal, newGrades, newClass);
        newGPA.calculateGPA(newTotal);
        System.out.println(newResult);
    }
}
