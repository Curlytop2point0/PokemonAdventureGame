/* Pokemon.java */
/* 
   Represents a Pokémon with basic attributes.
*/

public class Pokemon {
    private int id;
    private String name;
    private String type;
    private int health;
    
    // Constructor
    public Pokemon(int id, String name, String type, int health) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.health = health;
    }
    
    // Getter for id
    public int getId() {
        return id;
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Getter for type
    public String getType() {
        return type;
    }
    
    // Getter for health
    public int getHealth() {
        return health;
    }
    
    // Setter for health
    public void setHealth(int health) {
        this.health = health;
    }
    
    // Method to simulate taking damage
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }
    
    // Overriding toString() to display Pokémon details nicely
    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Type: " + type + " | HP: " + health;
    }
}
