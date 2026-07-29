import java.util.Scanner;

public class NumberGuess {
    
    public static void main(String[] args) {
        byte TotalAttempts = 10;
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to GUESS THE NUMBER game");
        System.out.println();
        System.out.println("Let's Start");
        System.out.println();
        byte number = (byte)(Math.random() * 100);
        System.out.println("You have maximum 10 attempts to guess");
        
        byte guess = -1;
        byte attempts = 0;

        while (guess != number && attempts < TotalAttempts) {
            ++attempts;
            System.out.println("Attempt " + attempts + " Enter your guess (0 - 100): ");
            guess = Byte.parseByte(sc.nextLine());

            if (guess == number) {
                System.out.println("You won");
                System.out.println("Exiting...");
                break;
            } else if (guess < number) {
                System.out.println("Your guess is smaller");
            } else {
                System.out.println("Your guess is larger");
            }
        }

        if (guess != number && attempts == TotalAttempts) {
            System.out.println();
            System.out.println("You Lost. Max attempts reached.");
        }

        sc.close();
    }
}