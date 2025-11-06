import java.util.Scanner;

public class SiakadFor20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade, highest = 0, lowest = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter the grade of the " + i + " student: ");
            grade = sc.nextDouble();
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }
}
