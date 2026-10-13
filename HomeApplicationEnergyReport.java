import java.util.Scanner;

public class HomeApplianceEnergyReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalCost = 0.0;

        for (int i = 0; i < n; i++) {
            String appliance = sc.next();
            int hours = sc.nextInt();
            boolean saver = false;

            if (sc.hasNext("SAVER")) {
                sc.next(); // consume SAVER
                saver = true;
            }

            double power = 0.0;
            boolean saverSupported = false;

            switch (appliance) {
                case "FRIDGE":
                    power = 150;
                    saverSupported = false;
                    break;
                case "AC":
                    power = 1500;
                    saverSupported = true;
                    break;
                case "TV":
                    power = 100;
                    saverSupported = false;
                    break;
                case "WASHER":
                    power = 500;
                    saverSupported = true;
                    break;
                default:
                    System.out.println("Invalid appliance type");
                    continue;
            }

            if (saver && !saverSupported) {
                System.out.println(appliance + ": saver mode not supported");
                continue;
            }

            double units = (power * hours) / 1000.0;
            if (saver && saverSupported) {
                units *= 0.75; // reduce by 25%
            }
            double cost = units * 8;
            totalCost += cost;

            System.out.printf("%s: Units=%.2f Cost=%.2f%n", appliance, units, cost);
        }

        System.out.printf("Total Cost: %.2f%n", totalCost);
        sc.close();
    }
}
