import java.util.Scanner;
public class guessingnumbergame {
  

    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 100); // generate a random number between 0 and 99
        int attemptsRemaining = 5;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("I'm thinking of a number between 0 and 99.");

        while (attemptsRemaining > 0) {
            System.out.print("Enter your guess: ");
            Scanner scanner = new Scanner(System.in);
            int userGuess = scanner.nextInt();

            if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println(" Congratulations! You guessed the correct number: " + secretNumber);
                break;
            }

            attemptsRemaining--;
            System.out.println("Attempts remaining: " + attemptsRemaining);
        }

        if (attemptsRemaining == 0) {
            System.out.println("Sorry, you ran out of attempts. The correct answer was " + secretNumber);
        }

        System.out.println("Do you want to play again? (yes/no)");
        Scanner scanner2 = new Scanner(System.in);
        String response = scanner2.next();

        if (response.equalsIgnoreCase("yes")) {
            main(args); // restart the game
        } else {
            System.out.println("Thanks for playing!");
        }
    }
}

