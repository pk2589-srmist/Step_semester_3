import java.util.Scanner;

public class MovieTicketCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0.0;

        for (int i = 0; i < n; i++) {
            String seatType = sc.next();
            int count = sc.nextInt();
            double price = 0.0;

            switch (seatType) {
                case "REGULAR":
                    price = 150;
                    break;
                case "PREMIUM":
                    price = 250;
                    break;
                case "RECLINER":
                    price = 400;
                    break;
                default:
                    System.out.println("Invalid seat type");
                    continue;
            }

            double amount = (price + 20) * count;
            total += amount;
            System.out.printf("%s: %.2f%n", seatType, amount);
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
