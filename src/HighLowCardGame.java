import java.util.Random;
import java.util.Scanner;

public class HighLowCardGame extends Game {

    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    private int currentCard;

    
    public HighLowCardGame() {
        super("High Low Card Game");
    }

    
    @Override
    public void start() {

        try {

            System.out.println("Welcome to " + getName() + "!");
            System.out.println("Guess if the next card will be Higher or Lower.");
            System.out.println("Type H for Higher or L for Lower.");

            \
            currentCard = random.nextInt(13) + 1;

            System.out.println("Current card: " + currentCard);

        } catch (Exception e) {

            System.out.println("Error starting the game.");

        }
    }

    
    @Override
    public void play() {

        boolean playing = true;

        while (playing) {

            try {

                System.out.print("Enter H or L: ");
                String guess = scanner.nextLine();

                
                boolean onlySpaces = true;

                for (int i = 0; i < guess.length(); i++) {

                    if (guess.charAt(i) != ' ') {
                        onlySpaces = false;
                        break;
                    }
                }

                
                if (guess.equals("") || onlySpaces) {

                    System.out.println("Input cannot be empty.");

                } else if (!guess.equalsIgnoreCase("H") &&
                           !guess.equalsIgnoreCase("L")) {

                    System.out.println("Please enter only H or L.");

                } else {

                    
                    int nextCard = random.nextInt(13) + 1;

                    System.out.println("Next card: " + nextCard);

                    
                    if ((guess.equalsIgnoreCase("H") && nextCard > currentCard) ||(guess.equalsIgnoreCase("L") && nextCard < currentCard)) {

                        System.out.println("Correct!");

                    } else if (nextCard == currentCard) {

                        System.out.println("Tie! Same card value.");

                    } else {

                        System.out.println("Wrong guess.");

                    }

                    
                    currentCard = nextCard;

                    
                    System.out.print("Play another round? (Y/N): ");
                    String answer = scanner.nextLine();

                    if (answer.equalsIgnoreCase("N")) {
                        playing = false;
                    }
                }

            } catch (Exception e) {

                System.out.println("Invalid input. Please try again.");

            }
        }

        
        end();
    }

    // Main method
    public static void main(String[] args) {

        try {

            HighLowCardGame game = new HighLowCardGame();

            game.start();
            game.play();

        } catch (Exception e) {

            System.out.println("Game crashed unexpectedly.");

        }
    }
}