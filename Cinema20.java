import java. util.Scanner;

public class Cinema20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTickets = 0;
        int ticketPrice = 50000;
        double totalPrice;
        double totalSales = 0;

        String another;

        System.out.println("=== Cinema Ticket Sales Program ===");

        do { 
            int ticketsBought;
        
        do { 
            System.out.print("Input the amount of tickets bought: ");
            ticketsBought = sc.nextInt();
            if (ticketsBought < 0) {
                System.out.println("Invalid input! Ticket amount cannot be negative. Please re-input.");
            } else {
                break;
            }
        } while (ticketsBought < 0);

        double discount = 0;

        if (ticketsBought > 10) {
            discount = 0.15;
        } else if (ticketsBought > 4) {
            discount = 0.10;
        }

        totalPrice = ticketsBought * ticketPrice;
        totalPrice -= totalPrice * discount;

        totalSales += totalPrice;
        totalTickets += ticketsBought;

            System.out.printf("Total price for this customer: Rp %.2f%n", totalPrice);
            System.out.print("Are there another purchase? (yes/no): ");
            another = sc.next();
        } while (another.equalsIgnoreCase("yes"));

        System.out.println("\n=== End of Day Summary ===");
        System.out.println("Total tickets sold: " + totalTickets);
        System.out.printf("Total sales: Rp %.2f%n", totalSales);

        sc.close();
        
    }
}