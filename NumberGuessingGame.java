import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;
        
        System.out.println("Guess a number between 1 and 100:");
        
        while (userGuess != numberToGuess) {
            userGuess = scanner.nextInt();
            
            if (userGuess < numberToGuess) {
                System.out.println("Higher! Try again:");
            } else if (userGuess > numberToGuess) {
                System.out.println("Lower! Try again:");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        }
    }
}
