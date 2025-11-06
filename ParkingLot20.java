import java.util.Scanner;

public class ParkingLot20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type, duration;
        int total = 0;

        System.out.println("=== Parking Fee Calculation Program ===");
        
        do { 
            System.out.print("Enter vehicle type (1 = Car, 2 = Motorcycle, 0 = Exit): ");
            type = sc.nextInt();
    
            if (type == 1 || type == 2) {
                System.out.print("Input parking duration (hours): ");
                duration = sc.nextInt();

            if (duration < 0) {
                System.out.println("Duration cannot be negative! Please try again.");
                continue; 
            }

            if (duration > 5) {
                total += 12500;
            } else if (type == 1) {
                total += duration * 3000;
            } else if (type == 2) {
                total += duration * 2000;
            }
            } else if (type !=0) {
                System.out.println("Invalid input! Please input 1, 2, or 0");
            }
        } while (type !=0);

        System.out.println("\n=== Total Parking Summary ===");
        System.out.println("Total parking fee: Rp " + total);

        sc.close();
    }
}
