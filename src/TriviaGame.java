
import java.util.Scanner;



public class TriviaGame extends Game{
	
	
	public TriviaGame(String name) {
        super(name);
    }
	
	
	
	String [] questions = {"How many continents are there?", "What does the itlian word Farfalle mean?", "What dye came from snails?", "What three colors make up all other colors?", "What is the main way to remove wrinkles in clothes?", "What was the name of the cat and mouse in the famous 1940's cartoon?"};
	String [] QA1 = {"A.7", "B.8", "C.5"};
	String [] QA2 = {"A.Bowtie", "B.Butterfly", "C.Noodle"};
	String [] QA3 = {"A.Red", "B.Purple", "C.Green"};
	String [] QA4 = {"A.Red Green Blue", "B.Red Yellow Blue", "C.Green Yellow Orange"};
	String [] QA5 = {"A.Ironing", "B.Hanging", "C.Icing"};
	String [] QA6 = {"A.Jim & Tim", "B.Curtis", "C.Tom & Jerry"};

	
	String [] correctAnswers = {"A","B","B","A","A","C"};
	
	@Override
    public void start() {
        System.out.println("Starting Trivia Game!");
    }

    @Override
    public void play() {
        runTriviaGame(questions,QA1,QA2,QA3,QA4,QA5,QA6,correctAnswers);
    }
	
	public static void displayQuestion(String question, String [] QC) {
		System.out.println("\n" + question);
		for(String choices:QC) {
			System.out.println(choices);
		}
	}
	
	public static String getUserAnswer() {
        Scanner input = new Scanner(System.in);
        String answer;
        while (true) {
            System.out.print("Enter A, B, or C: ");
            answer = input.nextLine();
            answer = answer.toUpperCase();

            if (answer.equals("A") || answer.equals("B") || answer.equals("C")) {
                return answer;
            } 
            else {
                System.out.println("Invalid input. Try again.");
            }
        }
    }
	
    public static boolean checkAnswer(String userAnswer, String correctAnswer) {
        return userAnswer.equals(correctAnswer);
    }
    
    
    public static void runTriviaGame(String [] questions, String [] QA1, String [] QA2, String [] QA3, String [] QA4,String [] QA5,String [] QA6,String [] correctAnswers) {
    	int correct = 0;
    	int incorrect = 0;
    	
    	for (int i = 0; i <questions.length; i++) {
    		if (i == 0) {
    			displayQuestion(questions[i], QA1);
    		}
    		
    		else if (i == 1) {
    			displayQuestion(questions[i], QA2);
    		}
    		
    		else if (i == 2) {
    			displayQuestion(questions[i], QA3);
    		}
    		
    		else if (i == 3) {
    			displayQuestion(questions[i], QA4);
    		}
    		
    		else if (i == 4) {
    			displayQuestion(questions[i], QA5);
    		}
    		
    		else if (i == 5) {
    			displayQuestion(questions[i], QA6);
    		}
    		
    		String userInput = getUserAnswer();
    		
    		if(checkAnswer(userInput, correctAnswers[i])) {
    			System.out.println("Correct");
                correct += 1;
    		}
    		
    		else {
    			System.out.println("Incorrect");
                incorrect += 1;
    		}
    	}
    	
    	System.out.println("\nGame Over");
        System.out.println("# Correct: " + correct);
        System.out.println("# Incorrect: " + incorrect);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
