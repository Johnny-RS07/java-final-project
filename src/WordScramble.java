import java.util.Random;
import java.util.Scanner;

public class WordScramble extends Game {

    // Array of words
    private String[] words = {"Hazzel", "Cricket", "And", "Thrill","Quil", "Chromosome"};

    private String originalWord;
    private String scrambledWord;

    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    
    public WordScramble() {
        super("Word Scramble");
    }

    
    @Override
    public void start() {

        try {

            System.out.println("Welcome to " + getName() + "!");
            System.out.println("Unscramble the letters to guess the correct word.");

            // Randomly choose a word
            originalWord = words[random.nextInt(words.length)];

            // Scramble the word
            scrambledWord = scrambleWord(originalWord);

            System.out.println("Scrambled Word: " + scrambledWord);

        } catch (Exception e) {
            System.out.println("An error occurred while starting the game.");
        }
    }


    @Override
    public void play() {

        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {

            try {

                System.out.print("Enter your guess: ");
                String guess = scanner.nextLine();

                // Check if input is empty or only spaces
                boolean onlySpaces = true;

                for (int i = 0; i < guess.length(); i++) {

                    if (guess.charAt(i) != ' ') {
                        onlySpaces = false;
                        break;
                    }
                }

                // Validate input
                if (guess.equals("") || onlySpaces) {

                    System.out.println("Input cannot be empty.");

                } else if (guess.equalsIgnoreCase(originalWord)) {

                    System.out.println("Correct! You guessed the word!");
                    guessedCorrectly = true;

                } else {

                    System.out.println("Wrong guess. Try again.");

                }

            } catch (Exception e) {

                System.out.println("Invalid input. Please try again.");

            }
        }

        end();
    }

    // Method to scramble the word
    private String scrambleWord(String word) {

        try {

            char[] letters = word.toCharArray();

            // Shuffle letters
            for (int i = 0; i < letters.length; i++) {

                int randomIndex = random.nextInt(letters.length);

                // Swap characters
                char temp = letters[i];
                letters[i] = letters[randomIndex];
                letters[randomIndex] = temp;
            }

            return new String(letters);

        } catch (Exception e) {

            System.out.println("Error scrambling the word.");
            return word;
        }
    }

    // Main method
    public static void main(String[] args) {

        try {

            WordScramble game = new WordScramble();

            game.start();
            game.play();

        } catch (Exception e) {

            System.out.println("Game crashed unexpectedly.");
        }
    }
}