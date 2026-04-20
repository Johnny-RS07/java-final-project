import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        //establishes my lovely variable
        int choice = 0;

        // establishes the base information
        Game guessGame = new GuessTheNumber("Guess the Number");
        Game RPSGame = new RockPaperScissors("Rock, Paper, Scissors");

        // Loops until user chooses to quit
        while (choice != 3) {


            System.out.println("Welcome to the Java Game Hub");
            System.out.println("------------------------------------------");
            System.out.println("Please select a game you would like to play:");
            System.out.println("1. Guess the Number");
            System.out.println("2. Rock, Paper, Scissors");
            System.out.println("3. Quit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            System.out.println("/n");

            
            if (choice == 1) {
                guessGame.start();
                guessGame.play();

            } 
            
            else if (choice == 2) {
                RPSGame.start();
                RPSGame.play();

            } 
            
            else if (choice == 3) {
                System.out.println("Goodbye!");

            } 
            
            else {
                System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }

        scanner.close();
    }
}