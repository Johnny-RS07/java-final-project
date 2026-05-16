import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Establishes my lovely variable
        int choice = 0;

        // Game objects
        Game guessGame = new GuessTheNumber("Guess the Number");
        Game RPSGame = new RockPaperScissors("Rock, Paper, Scissors");
        Game triviaGame = new TriviaGame("Trivia Game");
        Game wordScrambleGame = new WordScramble();
        Game highLowGame = new HighLowCardGame();

        
        while (choice != 6) {

            try {

                System.out.println("Welcome to the Java Game Hub");
                System.out.println("------------------------------------------");
                System.out.println("Please select a game you would like to play:");
                System.out.println("1. Guess the Number");
                System.out.println("2. Rock, Paper, Scissors");
                System.out.println("3. Trivia Game");
                System.out.println("4. Word Scramble");
                System.out.println("5. High Low Card Game");
                System.out.println("6. Quit");

                System.out.print("Enter your choice: ");

                choice = scanner.nextInt();
                scanner.nextLine();

                System.out.println("\n");

                if (choice == 1) {

                    guessGame.start();
                    guessGame.play();

                }

                else if (choice == 2) {

                    RPSGame.start();
                    RPSGame.play();

                }

                else if (choice == 3) {

                    triviaGame.start();
                    triviaGame.play();

                }

                else if (choice == 4) {

                    wordScrambleGame.start();
                    wordScrambleGame.play();

                }

                else if (choice == 5) {

                    highLowGame.start();
                    highLowGame.play();

                }

                else if (choice == 6) {

                    System.out.println("Goodbye!");

                }

                else {

                    System.out.println("Invalid choice. Please try again.");

                }

            } catch (Exception e) {

                System.out.println("Invalid input. Please enter a number.");

                scanner.nextLine(); 
            }

            System.out.println();
        }

        scanner.close();
    }
}