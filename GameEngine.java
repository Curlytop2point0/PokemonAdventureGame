/* GameEngine.java */
import java.util.Scanner;

/*
   Manages the game flow including the main game loop,
   user interactions, and handling wild Pokémon encounters.
*/

public class GameEngine {
    private Trainer trainer;
    private Pokedex pokedex;
    private Scanner scanner;
    
    // Constructor initializes the scanner and pokedex.
    public GameEngine() {
        scanner = new Scanner(System.in);
        pokedex = new Pokedex();
    }
    
    // Starts the game.
    // Assigns a starter Pokémon, and enters the game loop.
    public void startGame() {
        System.out.println("Welcome to the Pokémon Adventure Game!");
        System.out.print("Enter your name, Trainer: ");
        String trainerName = scanner.nextLine();
        trainer = new Trainer(trainerName);
        
        // Assign a starter Pokémon (Bulbasaur in this case)
        Pokemon starter = pokedex.getPokemon(1);
        System.out.println("You have received your starter Pokémon: " + starter.getName());
        trainer.addPokemon(starter);
        
        // Begin the main game loop
        gameLoop();
    }
    
    // The game loop offers the player multiple choices.
    private void gameLoop() {
        boolean running = true;
        while (running) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. View your Pokémon team");
            System.out.println("2. Explore the wild");
            System.out.println("3. Exit the game");
            System.out.print("Enter your choice: ");
            
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    trainer.showTeam();
                    break;
                case "2":
                    explore();
                    break;
                case "3":
                    running = false;
                    System.out.println("Goodbye, Trainer!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    // Simulates an exploration event where a wild Pokémon is encountered.
    private void explore() {
        System.out.println("You venture into the wild...");
        
        // Random encounter with a wild Pokémon from the pokedex.
        Pokemon wildPokemon = pokedex.getRandomPokemon();
        System.out.println("A wild " + wildPokemon.getName() + " has appeared!");
        
        System.out.print("Do you want to try and catch it? (yes/no): ");
        String response = scanner.nextLine().toLowerCase();
        
        if (response.equals("yes") || response.equals("y")) {
            trainer.addPokemon(wildPokemon);
            System.out.println("Congratulations! You caught " + wildPokemon.getName() + "!");
        } else {
            System.out.println("You decided not to catch " + wildPokemon.getName() + ".");
        }
    }
}
