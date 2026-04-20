public class Game {

	//establishes my precious variables
    private String name;


    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void start() {
        System.out.println("Starting the game.");
    }

    public void play() {
        System.out.println("Playing the game.");
    }


    public void end() {
        System.out.println("Ending the game.");
        System.exit(0);
    }
}