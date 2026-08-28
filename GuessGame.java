import java.util.Scanner;
public class GuessGame{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the secret number:");
        int secretnum=sc.nextInt();
        System.out.println("Enter the maxm no of tries");
        int maxmTries=sc.nextInt();
        int tries=0;
        boolean guessed=false;
        while(maxmTries>=tries && !guessed){
            System.out.println("Enter your guess:");
            int guess =sc.nextInt();
            tries++;
            if(guess>secretnum){
                System.out.println("Too high");
            }
            else if(guess < secretnum){
                System.out.println("Too low");}
            else{
                System.out.println("You guessed right!");
                guessed=true;
                }
                 }
                 if(!guessed){
                    System.out.println("out of no. of tries");

                 }
                 sc.close();

    }
}