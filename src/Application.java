/**
 * 
 * @author Michael Elder Programming Lab 1 Problem 1 Application class tests all
 *         of the methods.
 */
public class Application {

	public static void main(String[] args) {
		/**
		 * Created a NonPlayerCharacter and GameCharacter objects and tested the
		 * different methods
		 */
		NonPlayerCharacter n = new NonPlayerCharacter("487", "Neutral", false, "AVERAGE");
		// Created a nonPlayerCharacter
		GameCharacter g = new GameCharacter("487", "Positive");
		// Created a GameCharacter
		System.out.println(g.reportStructure());
		System.out.println(n.reportStructure());
		// Printing out the reportStructure for objects g and n
		System.out.println(n.introduce());
		// Printing out the introduce method for object n
		System.out.println(n.exclaim());
		// Printing out the exclaim method for object n
	}

}
