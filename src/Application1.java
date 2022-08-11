
/**
 * 
 * @author Michael Elder
 * 		   Programming Lab 1 Problem 2
 *		   Application 1 class that tests the SportsTeam and BasketballTeam classes and methods
 */
import java.util.Arrays;

public class Application1 {

	public static void main(String[] args) {
		BasketballTeam cardinals = new BasketballTeam("UofL", "Cardinals", "Chris Mack", 20, 30, 100, 164, 82, 116);
		// Creating a cardinals BasketballTeam
		System.out.println("Stats: " + "\n");
		// Prints string Stats: and a next line
		System.out.println(Arrays.toString(cardinals.getStats()) + "\n");
		// Prints out the getStats method that prints an array of doubles
		System.out.println("toString: " + "\n");
		// Prints string toString and a next line
		System.out.println(cardinals.toString());
		// Prints out the toString method
	}

}
