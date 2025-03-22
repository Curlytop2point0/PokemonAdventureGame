/* Pokedex.java */
import java.util.HashMap;

/*
    This version of the Pokedex includes the first 151 Pokémon (Generation I), with information
    sourced from Serebii.net and canonical Pokémon data.
*/

public class Pokedex {
    private HashMap<Integer, Pokemon> pokedex;
    
    // Constructor
    public Pokedex() {
        pokedex = new HashMap<>();
        initializePokedex();
    }
    
    // Populates the pokedex with data for the first 151 Pokémon.
    private void initializePokedex() {
        // Generation I Pokémon (IDs 1–151)
        pokedex.put(1, new Pokemon(1, "Bulbasaur", "Grass/Poison", 45));
        pokedex.put(2, new Pokemon(2, "Ivysaur", "Grass/Poison", 60));
        pokedex.put(3, new Pokemon(3, "Venusaur", "Grass/Poison", 80));
        pokedex.put(4, new Pokemon(4, "Charmander", "Fire", 39));
        pokedex.put(5, new Pokemon(5, "Charmeleon", "Fire", 58));
        pokedex.put(6, new Pokemon(6, "Charizard", "Fire/Flying", 78));
        pokedex.put(7, new Pokemon(7, "Squirtle", "Water", 44));
        pokedex.put(8, new Pokemon(8, "Wartortle", "Water", 59));
        pokedex.put(9, new Pokemon(9, "Blastoise", "Water", 79));
        pokedex.put(10, new Pokemon(10, "Caterpie", "Bug", 45));
        pokedex.put(11, new Pokemon(11, "Metapod", "Bug", 50));
        pokedex.put(12, new Pokemon(12, "Butterfree", "Bug/Flying", 60));
        pokedex.put(13, new Pokemon(13, "Weedle", "Bug/Poison", 40));
        pokedex.put(14, new Pokemon(14, "Kakuna", "Bug/Poison", 45));
        pokedex.put(15, new Pokemon(15, "Beedrill", "Bug/Poison", 65));
        pokedex.put(16, new Pokemon(16, "Pidgey", "Normal/Flying", 40));
        pokedex.put(17, new Pokemon(17, "Pidgeotto", "Normal/Flying", 63));
        pokedex.put(18, new Pokemon(18, "Pidgeot", "Normal/Flying", 83));
        pokedex.put(19, new Pokemon(19, "Rattata", "Normal", 30));
        pokedex.put(20, new Pokemon(20, "Raticate", "Normal", 55));
        pokedex.put(21, new Pokemon(21, "Spearow", "Normal/Flying", 40));
        pokedex.put(22, new Pokemon(22, "Fearow", "Normal/Flying", 65));
        pokedex.put(23, new Pokemon(23, "Ekans", "Poison", 35));
        pokedex.put(24, new Pokemon(24, "Arbok", "Poison", 60));
        pokedex.put(25, new Pokemon(25, "Pikachu", "Electric", 35));
        pokedex.put(26, new Pokemon(26, "Raichu", "Electric", 60));
        pokedex.put(27, new Pokemon(27, "Sandshrew", "Ground", 50));
        pokedex.put(28, new Pokemon(28, "Sandslash", "Ground", 75));
        pokedex.put(29, new Pokemon(29, "Nidoran♀", "Poison", 55));
        pokedex.put(30, new Pokemon(30, "Nidorina", "Poison", 70));
        pokedex.put(31, new Pokemon(31, "Nidoqueen", "Poison/Ground", 90));
        pokedex.put(32, new Pokemon(32, "Nidoran♂", "Poison", 46));
        pokedex.put(33, new Pokemon(33, "Nidorino", "Poison", 61));
        pokedex.put(34, new Pokemon(34, "Nidoking", "Poison/Ground", 81));
        pokedex.put(35, new Pokemon(35, "Clefairy", "Fairy", 70));
        pokedex.put(36, new Pokemon(36, "Clefable", "Fairy", 95));
        pokedex.put(37, new Pokemon(37, "Vulpix", "Fire", 38));
        pokedex.put(38, new Pokemon(38, "Ninetales", "Fire", 73));
        pokedex.put(39, new Pokemon(39, "Jigglypuff", "Normal/Fairy", 115));
        pokedex.put(40, new Pokemon(40, "Wigglytuff", "Normal/Fairy", 140));
        pokedex.put(41, new Pokemon(41, "Zubat", "Poison/Flying", 40));
        pokedex.put(42, new Pokemon(42, "Golbat", "Poison/Flying", 75));
        pokedex.put(43, new Pokemon(43, "Oddish", "Grass/Poison", 45));
        pokedex.put(44, new Pokemon(44, "Gloom", "Grass/Poison", 60));
        pokedex.put(45, new Pokemon(45, "Vileplume", "Grass/Poison", 80));
        pokedex.put(46, new Pokemon(46, "Paras", "Bug/Grass", 35));
        pokedex.put(47, new Pokemon(47, "Parasect", "Bug/Grass", 60));
        pokedex.put(48, new Pokemon(48, "Venonat", "Bug", 60));
        pokedex.put(49, new Pokemon(49, "Venomoth", "Bug/Poison", 70));
        pokedex.put(50, new Pokemon(50, "Diglett", "Ground", 10));
        pokedex.put(51, new Pokemon(51, "Dugtrio", "Ground", 35));
        pokedex.put(52, new Pokemon(52, "Meowth", "Normal", 40));
        pokedex.put(53, new Pokemon(53, "Persian", "Normal", 65));
        pokedex.put(54, new Pokemon(54, "Psyduck", "Water", 50));
        pokedex.put(55, new Pokemon(55, "Golduck", "Water", 80));
        pokedex.put(56, new Pokemon(56, "Mankey", "Fighting", 40));
        pokedex.put(57, new Pokemon(57, "Primeape", "Fighting", 65));
        pokedex.put(58, new Pokemon(58, "Growlithe", "Fire", 55));
        pokedex.put(59, new Pokemon(59, "Arcanine", "Fire", 90));
        pokedex.put(60, new Pokemon(60, "Poliwag", "Water", 40));
        pokedex.put(61, new Pokemon(61, "Poliwhirl", "Water", 65));
        pokedex.put(62, new Pokemon(62, "Poliwrath", "Water/Fighting", 90));
        pokedex.put(63, new Pokemon(63, "Abra", "Psychic", 25));
        pokedex.put(64, new Pokemon(64, "Kadabra", "Psychic", 40));
        pokedex.put(65, new Pokemon(65, "Alakazam", "Psychic", 55));
        pokedex.put(66, new Pokemon(66, "Machop", "Fighting", 70));
        pokedex.put(67, new Pokemon(67, "Machoke", "Fighting", 80));
        pokedex.put(68, new Pokemon(68, "Machamp", "Fighting", 90));
        pokedex.put(69, new Pokemon(69, "Bellsprout", "Grass/Poison", 50));
        pokedex.put(70, new Pokemon(70, "Weepinbell", "Grass/Poison", 65));
        pokedex.put(71, new Pokemon(71, "Victreebel", "Grass/Poison", 80));
        pokedex.put(72, new Pokemon(72, "Tentacool", "Water/Poison", 40));
        pokedex.put(73, new Pokemon(73, "Tentacruel", "Water/Poison", 80));
        pokedex.put(74, new Pokemon(74, "Geodude", "Rock/Ground", 40));
        pokedex.put(75, new Pokemon(75, "Graveler", "Rock/Ground", 55));
        pokedex.put(76, new Pokemon(76, "Golem", "Rock/Ground", 80));
        pokedex.put(77, new Pokemon(77, "Ponyta", "Fire", 50));
        pokedex.put(78, new Pokemon(78, "Rapidash", "Fire", 65));
        pokedex.put(79, new Pokemon(79, "Slowpoke", "Water/Psychic", 90));
        pokedex.put(80, new Pokemon(80, "Slowbro", "Water/Psychic", 95));
        pokedex.put(81, new Pokemon(81, "Magnemite", "Electric", 25));
        pokedex.put(82, new Pokemon(82, "Magneton", "Electric", 50));
        pokedex.put(83, new Pokemon(83, "Farfetch'd", "Normal/Flying", 52));
        pokedex.put(84, new Pokemon(84, "Doduo", "Normal/Flying", 35));
        pokedex.put(85, new Pokemon(85, "Dodrio", "Normal/Flying", 60));
        pokedex.put(86, new Pokemon(86, "Seel", "Water", 65));
        pokedex.put(87, new Pokemon(87, "Dewgong", "Water/Ice", 70));
        pokedex.put(88, new Pokemon(88, "Grimer", "Poison", 80));
        pokedex.put(89, new Pokemon(89, "Muk", "Poison", 105));
        pokedex.put(90, new Pokemon(90, "Shellder", "Water", 30));
        pokedex.put(91, new Pokemon(91, "Cloyster", "Water/Ice", 50));
        pokedex.put(92, new Pokemon(92, "Gastly", "Ghost/Poison", 30));
        pokedex.put(93, new Pokemon(93, "Haunter", "Ghost/Poison", 45));
        pokedex.put(94, new Pokemon(94, "Gengar", "Ghost/Poison", 60));
        pokedex.put(95, new Pokemon(95, "Onix", "Rock/Ground", 35));
        pokedex.put(96, new Pokemon(96, "Drowzee", "Psychic", 60));
        pokedex.put(97, new Pokemon(97, "Hypno", "Psychic", 85));
        pokedex.put(98, new Pokemon(98, "Krabby", "Water", 30));
        pokedex.put(99, new Pokemon(99, "Kingler", "Water", 55));
        pokedex.put(100, new Pokemon(100, "Voltorb", "Electric", 40));
        pokedex.put(101, new Pokemon(101, "Electrode", "Electric", 60));
        pokedex.put(102, new Pokemon(102, "Exeggcute", "Grass/Psychic", 60));
        pokedex.put(103, new Pokemon(103, "Exeggutor", "Grass/Psychic", 95));
        pokedex.put(104, new Pokemon(104, "Cubone", "Ground", 50));
        pokedex.put(105, new Pokemon(105, "Marowak", "Ground", 60));
        pokedex.put(106, new Pokemon(106, "Hitmonlee", "Fighting", 50));
        pokedex.put(107, new Pokemon(107, "Hitmonchan", "Fighting", 50));
        pokedex.put(108, new Pokemon(108, "Lickitung", "Normal", 90));
        pokedex.put(109, new Pokemon(109, "Koffing", "Poison", 40));
        pokedex.put(110, new Pokemon(110, "Weezing", "Poison", 65));
        pokedex.put(111, new Pokemon(111, "Rhyhorn", "Ground/Rock", 80));
        pokedex.put(112, new Pokemon(112, "Rhydon", "Ground/Rock", 105));
        pokedex.put(113, new Pokemon(113, "Chansey", "Normal", 250));
        pokedex.put(114, new Pokemon(114, "Tangela", "Grass", 65));
        pokedex.put(115, new Pokemon(115, "Kangaskhan", "Normal", 95));
        pokedex.put(116, new Pokemon(116, "Horsea", "Water", 30));
        pokedex.put(117, new Pokemon(117, "Seadra", "Water", 55));
        pokedex.put(118, new Pokemon(118, "Goldeen", "Water", 45));
        pokedex.put(119, new Pokemon(119, "Seaking", "Water", 80));
        pokedex.put(120, new Pokemon(120, "Staryu", "Water", 30));
        pokedex.put(121, new Pokemon(121, "Starmie", "Water/Psychic", 60));
        pokedex.put(122, new Pokemon(122, "Mr. Mime", "Psychic/Fairy", 40));
        pokedex.put(123, new Pokemon(123, "Scyther", "Bug/Flying", 70));
        pokedex.put(124, new Pokemon(124, "Jynx", "Ice/Psychic", 65));
        pokedex.put(125, new Pokemon(125, "Electabuzz", "Electric", 65));
        pokedex.put(126, new Pokemon(126, "Magmar", "Fire", 65));
        pokedex.put(127, new Pokemon(127, "Pinsir", "Bug", 65));
        pokedex.put(128, new Pokemon(128, "Tauros", "Normal", 75));
        pokedex.put(129, new Pokemon(129, "Magikarp", "Water", 20));
        pokedex.put(130, new Pokemon(130, "Gyarados", "Water/Flying", 95));
        pokedex.put(131, new Pokemon(131, "Lapras", "Water/Ice", 130));
        pokedex.put(132, new Pokemon(132, "Ditto", "Normal", 48));
        pokedex.put(133, new Pokemon(133, "Eevee", "Normal", 55));
        pokedex.put(134, new Pokemon(134, "Vaporeon", "Water", 130));
        pokedex.put(135, new Pokemon(135, "Jolteon", "Electric", 65));
        pokedex.put(136, new Pokemon(136, "Flareon", "Fire", 65));
        pokedex.put(137, new Pokemon(137, "Porygon", "Normal", 65));
        pokedex.put(138, new Pokemon(138, "Omanyte", "Rock/Water", 35));
        pokedex.put(139, new Pokemon(139, "Omastar", "Rock/Water", 70));
        pokedex.put(140, new Pokemon(140, "Kabuto", "Rock/Water", 30));
        pokedex.put(141, new Pokemon(141, "Kabutops", "Rock/Water", 60));
        pokedex.put(142, new Pokemon(142, "Aerodactyl", "Rock/Flying", 80));
        pokedex.put(143, new Pokemon(143, "Snorlax", "Normal", 160));
        pokedex.put(144, new Pokemon(144, "Articuno", "Ice/Flying", 90));
        pokedex.put(145, new Pokemon(145, "Zapdos", "Electric/Flying", 90));
        pokedex.put(146, new Pokemon(146, "Moltres", "Fire/Flying", 90));
        pokedex.put(147, new Pokemon(147, "Dratini", "Dragon", 41));
        pokedex.put(148, new Pokemon(148, "Dragonair", "Dragon", 61));
        pokedex.put(149, new Pokemon(149, "Dragonite", "Dragon/Flying", 91));
        pokedex.put(150, new Pokemon(150, "Mewtwo", "Psychic", 106));
        pokedex.put(151, new Pokemon(151, "Mew", "Psychic", 100));
    }
    
    // Retrieves a Pokémon by its ID.
    public Pokemon getPokemon(int id) {
        return pokedex.get(id);
    }
    
    // Retrieves a random Pokémon from the pokedex.
    public Pokemon getRandomPokemon() {
        int randomId = (int)(Math.random() * 151) + 1;
        return pokedex.get(randomId);
    }
}
