import java.util.Scanner;

public class CollegeFeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalCollected = 0.0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            double fee = 0.0;

            switch (type) {
                case "DAY_SCHOLAR":
                    fee = 40000 + 12000; // tuition + bus
                    break;
                case "HOSTELLER":
                    fee = 40000 + 60000; // tuition + hostel
                    break;
                case "SCHOLAR":
                    fee = 20000 + 12000; // half tuition + bus
                    break;
                default:
                    System.out.println("Invalid student type");
                    continue;
            }

            totalCollected += fee;
            System.out.printf("%s: %.2f%n", name, fee);
        }

        System.out.printf("Total Collected: %.2f%n", totalCollected);
        sc.close();
    }
}
