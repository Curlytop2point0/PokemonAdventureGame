/* Trainer.java */
import java.util.ArrayList;

/*
   Represents a Pokémon Trainer.
   The trainer has a name and a team of Pokémon (with a maximum of 6).
*/

public class Trainer {
    private String name;
    private ArrayList<Pokemon> team;
    
    // Constructor initializes the trainer's name and an empty team.
    public Trainer(String name) {
        this.name = name;
        this.team = new ArrayList<>();
    }
    
    // Adds a Pokémon to the team if there is room.
    public void addPokemon(Pokemon p) {
        if (team.size() < 6) {
            team.add(p);
            System.out.println(p.getName() + " was added to your team!");
        } else {
            System.out.println("Your team is full! You cannot have more than 6 Pokémon.");
        }
    }
    
    // Displays the trainer's current Pokémon team.
    public void showTeam() {
        System.out.println("\n" + name + "'s Pokémon Team:");
        if (team.isEmpty()) {
            System.out.println("You currently have no Pokémon in your team.");
        } else {
            for (Pokemon p : team) {
                System.out.println(p);
            }
        }
    }
}
