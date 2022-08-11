
/**
 * 
 * @author Michael Elder
 * 		   Programming Lab 1 Problem 1
 *		   NonPlayerCharacter class inherits from the GameCharacter class and adds two more variables: active and intelligenceType.
 */
import java.util.Random;

public class NonPlayerCharacter extends GameCharacter {
	private boolean active;
	private String intelligenceType;

	/**
	 * Empty argument constructor calling the constructor for the GameCharacter
	 * class and setting active = false and intelligenceType = ""
	 */
	public NonPlayerCharacter() {
		super();
		active = false;
		intelligenceType = "";
	}// end empty argument constructor

	/**
	 * Preferred constructor with parameters uniqueID, personality, active, and
	 * intelligenceType
	 */
	public NonPlayerCharacter(String uniqueID, String personality, boolean active, String intelligenceType) {
		super(uniqueID, personality);
		this.active = active;
		this.intelligenceType = intelligenceType;
	}// end preferred constructor

	/**
	 * reportStructure method that prints out the active and intelligenceType
	 * variables
	 */
	public String reportStructure() {
		return "Active: " + active + "\n" + "Intelligence Type: " + intelligenceType + "\n"
				+ "========================================";
	}// end reportStructure method

	/**
	 * introduce method prints "Hello, my Unique ID is variable uniqueID
	 */
	public String introduce() {
		return "Hello, my Unique ID is " + uniqueID + "\n" + "========================================";
	}// end introduce method

	/**
	 * exclaim method returns a random String from the array list of Strings
	 * provided below
	 */
	public String exclaim() {
		String[] array = { "Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers" };
		Random r = new Random();
		int random = r.nextInt(4);
		return array[random];
	}// end exclaim method

	/**
	 * isActive method
	 */
	public boolean isActive() {
		return active;
	}// end isActive

	/**
	 * Setter for active
	 */
	public void setActive(boolean active) {
		this.active = active;
	}// end setActive

	/**
	 * Getter for intelligenceType
	 */
	public String getIntelligenceType() {
		return intelligenceType;
	}// end getIntelligenceType

	/**
	 * Setter for intelligenceType
	 */
	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}// end setIntelligenceType

	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "NonPlayerCharacter [active=" + active + ", intelligenceType=" + intelligenceType + ", uniqueID="
				+ uniqueID + ", personality=" + personality + "]";
	}// end toString method
}// end class
