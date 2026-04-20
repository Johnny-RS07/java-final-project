import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber extends Game {

    private int secretNumber;
    private int attempts;
    private Scanner scanner;


    public GuessTheNumber(String name) {
        super(name);
        scanner = new Scanner(System.in);
    }

    // Override start()
    @Override
    public void start() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1; // 1–100
        attempts = 0;

        System.out.println("Starting " + getName() + "...");
        System.out.println("I have picked a number between 1 and 100.");
    }

    @Override
    public void play() {
        int guess = 0;

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low!");
            } else if (guess > secretNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
        }

        System.out.println("Returning to menu...\n");
    }
}
