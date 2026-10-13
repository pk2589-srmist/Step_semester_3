import java.util.Scanner;

public class CityCabFareMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0.0;

        for (int i = 0; i < n; i++) {
            String cab = sc.next();
            int km = sc.nextInt();
            String time = sc.next();

            double rate = 0.0;
            double fare = 0.0;

            switch (cab) {
                case "MINI":
                    rate = 10;
                    fare = km * rate;
                    if (fare < 100) fare = 100;
                    if (time.equals("NIGHT")) {
                        System.out.println("MINI: night service not available");
                        continue;
                    }
                    break;
                case "SEDAN":
                    rate = 14;
                    fare = km * rate;
                    if (fare < 100) fare = 100;
                    if (time.equals("NIGHT")) fare *= 1.2;
                    break;
                case "SUV":
                    rate = 18;
                    fare = km * rate;
                    if (fare < 100) fare = 100;
                    if (time.equals("NIGHT")) fare *= 1.2;
                    break;
                default:
                    System.out.println("Invalid cab type");
                    continue;
            }

            total += fare;
            System.out.printf("%s: %.2f%n", cab, fare);
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
