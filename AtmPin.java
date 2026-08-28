import java.util.Scanner;

public class AtmPin {

    public static void AtmPin() {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Set your correct 4-digit PIN: ");
        String correctPin = sc.nextLine();

        int attemptCount = 0;
        boolean success=false;

        
        while (attemptCount < 3 && !success) {
            System.out.print("Enter PIN attempt " + (attemptCount + 1) + ": ");
            String attempt = sc.nextLine();

            if (attempt.equals(correctPin)) {
                System.out.println("PIN accepted");
                success = true;
                break; 
            } else {
                System.out.println("Incorrect PIN");
            }
            attemptCount++;
        }

        
        if (!success) {
            System.out.println("Card blocked — too many incorrect attempts");
        }

        sc.close();
    }

    public static void main(String[] args) {
        AtmPin();
    }
}
