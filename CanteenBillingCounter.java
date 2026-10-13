import java.util.Scanner;

public class CanteenBillingCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0.0;

        for (int i = 0; i < n; i++) {
            String customer = sc.next();
            double amount = sc.nextDouble();
            double finalAmount = 0.0;

            switch (customer) {
                case "STUDENT":
                    finalAmount = amount * 0.9;
                    break;
                case "STAFF":
                    finalAmount = amount * 0.95;
                    break;
                case "GUEST":
                    finalAmount = amount + 10;
                    break;
                default:
                    finalAmount = amount;import java.util.Scanner;

public class CanteenBillingCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0.0;

        for (int i = 0; i < n; i++) {
            String customer = sc.next();
            double amount = sc.nextDouble();
            double finalAmount = 0.0;

            switch (customer) {
                case "STUDENT":
                    finalAmount = amount * 0.9;
                    break;
                case "STAFF":
                    finalAmount = amount * 0.95;
                    break;
                case "GUEST":
                    finalAmount = amount + 10;
                    break;
                default:
                    finalAmount = amount;
            }

            total += finalAmount;
            System.out.printf("%s: %.2f%n", customer, finalAmount);
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
            }

            total += finalAmount;
            System.out.printf("%s: %.2f%n", customer, finalAmount);
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}