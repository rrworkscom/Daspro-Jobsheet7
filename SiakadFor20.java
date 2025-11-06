import java.util.Scanner;

public class SiakadFor20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade, highest = 0, lowest = 100;
        int passed = 0, failed = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter the grade of the " + i + " student: ");
            grade = sc.nextDouble();
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }

             if (grade >= 60) {
                passed++; 
            } else {
                failed++; 
            }
        }

        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        System.out.println("Number of students who passed: " + passed);
        System.out.println("Number of students who failed: " + failed);
    }
}

