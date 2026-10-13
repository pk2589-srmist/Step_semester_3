import java.util.Scanner;

public class ParkingChargeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0.0;

        for (int i = 0; i < n; i++) {
            String vehicle = sc.next();
            int hours = sc.nextInt();
            double charge = 0.0;

            switch (vehicle) {
                case "BIKE":
                    charge = hours * 10;
                    break;
                case "CAR":
                    charge = 30 + (hours - 1) * 20;
                    break;
                case "TRUCK":
                    charge = Math.max(100, hours * 50);
                    break;
                default:
                    charge = 0.0;
            }

            total += charge;
            System.out.printf("%s: %.2f%n", vehicle, charge);
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}