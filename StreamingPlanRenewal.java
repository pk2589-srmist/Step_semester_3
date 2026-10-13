import java.time.LocalDate;
import java.util.Scanner;

public class StreamingPlanRenewal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String plan = sc.next();
            String name = sc.next();
            String startDateStr = sc.next();
            LocalDate startDate = LocalDate.parse(startDateStr);
            LocalDate renewalDate;

            switch (plan) {
                case "BASIC":
                    renewalDate = startDate.plusDays(30);
                    break;
                case "STANDARD":
                    renewalDate = startDate.plusDays(90);
                    break;
                case "PREMIUM":
                    renewalDate = startDate.plusDays(365);
                    break;
                default:
                    renewalDate = startDate;
            }

            System.out.println(name + ": " + renewalDate);
        }
        sc.close();
    }
}