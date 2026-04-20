import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors extends Game {

    private Scanner scanner;
    private Random random;

    // Constructor
    public RockPaperSicissors(String name) {
        super(name);
        scanner = new Scanner(System.in);
        random = new Random();
    }

    // Override start()
    @Override
    public void start() {
        System.out.println("Starting " + getName() + "...");
        System.out.println("Enter 1 for Rock, 2 for Paper, 3 for Scissors.");
    }

    // Override play()
    @Override
    public void play() {
        int userChoice;
        int computerChoice;
        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {

            System.out.print("Your choice (1-3): ");
            userChoice = scanner.nextInt();

            // Generate computer choice
            computerChoice = random.nextInt(3) + 1;

            // Show user's choice
            if (userChoice == 1) {
                System.out.println("You chose: Rock");
            } 
            
            else if (userChoice == 2) {
                System.out.println("You chose: Paper");
            } 
            
            else if (userChoice == 3) {
                System.out.println("You chose: Scissors");
            } 
            
            else {
                System.out.println("Invalid choice");
            }

            
            if (computerChoice == 1) {
                System.out.println("Computer chose: Rock");
            } 
            
            else if (computerChoice == 2) {
                System.out.println("Computer chose: Paper");
            } 
            
            else {
                System.out.println("Computer chose: Scissors");
            }

            
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } 
            
            else if (
                (userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)
            ) {
                System.out.println("You win!");
            } 
            
            else if (userChoice >= 1 && userChoice <= 3) {
                System.out.println("Computer wins!");
            } 
            
            else {
                System.out.println("Invalid input.");
            }

            // Ask to play again
            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.next();
            System.out.println();
        }

        System.out.println("Returning to menu...\n");
    }
}
