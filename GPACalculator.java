import java.util.Scanner;
public class GPACalculator {
    private int numOfPeriods;
    private String grades;

    private double totalGrade;
    private double classGrade;
    public GPACalculator(int numOfPeriods, String grades) {
        this.numOfPeriods = numOfPeriods;
        this.grades = grades;
    }
    public double breakdownString(String grades) {
        double totalGrade = 0;
        for (int i = 0; i < grades.length(); i++) {
            if (grades.charAt(i) == 'A') {
                totalGrade += 4.0;
            }
            else if (grades.charAt(i) == 'B') {
                totalGrade += 3.0;
            }
            else if (grades.charAt(i) == 'C') {
                totalGrade += 2.0;
            }
            else if (grades.charAt(i) == 'D') {
                totalGrade += 1.0;
            }
        }
        return totalGrade;
    }
    public double calculateGPA(double totalGrade,int numOfPeriods) {
        double GPA = totalGrade / numOfPeriods;
        return GPA;
    }


    public static void main(String args[]) {
        int newPeriods;
        String newGrades;
        double newTotal;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number of periods: ");
        newPeriods = input.nextInt();
        System.out.print("Enter your grades (A,B,C,F,A,B): ");
        newGrades = input.next();
        GPACalculator newCalc = new GPACalculator(newPeriods,newGrades);
        newTotal = newCalc.breakdownString(newGrades);
        System.out.println(newCalc.calculateGPA(newTotal,newPeriods));
    }
}
