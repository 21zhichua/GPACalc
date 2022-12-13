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
          if (grades.equals("A")) {
              totalGrade += 4.0;
          }
          if (grades.equals("B")) {
              totalGrade += 3.0;
          }
          if (grades.equals("C")) {
              totalGrade += 2.0;
          }
          if (grades.equals("D")) {
              totalGrade += 1.0;
          }
          if (grades.equals("F")) {
              totalGrade += 0.0;
          }

      }
        return totalGrade;
    }
    public double calculateGPA() {
        double GPA = totalGrade / numOfPeriods;
        return GPA;
    }


    public static void main(String args[]) {
        double newPeriods;
        String newGrades;
        double newTotal = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number of periods: ");
        newPeriods = input.nextDouble();
        System.out.print("Enter your grades (A,B,C,F,A,B): ");
        newGrades = input.nextLine();
        GPACalculator newGPA = new GPACalculator(newPeriods, newGrades);
        newGPA.breakdownString(newTotal);
        System.out.println(newGPA.calculateGPA());
    }
}
