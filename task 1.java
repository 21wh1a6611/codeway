// number game 
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        guessTheNumberGame();
    }
    public static void guessTheNumberGame() {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int maxAttempts = 5;
        int attempts = 0;
        boolean playAgain = true;
        int totalScore = 0;
        Scanner scanner = new Scanner(System.in);
        while (playAgain) {
            System.out.println("Welcome to Guess the Number Game!");
            System.out.println("Guess the number between 1 and 100.");
            System.out.println(" You have " + maxAttempts + " attempts.");
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    int score = calculateScore(attempts);
                    System.out.println("Your score for this round is: " + score);
                    totalScore += score;
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
                attempts++;
            }
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + secretNumber + ".");
            }
            System.out.println("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
            attempts = 0;
        }
        System.out.println("Your total score is " + totalScore + ".");
    }
    private static int calculateScore(int attempts) {
        return 50 - (attempts * 10);
    }
}
