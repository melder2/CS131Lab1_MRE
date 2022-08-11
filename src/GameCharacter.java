/**
 * 
 * @author Michael Elder Programming Lab 1 Problem 1 GameCharacter class is the
 *         parent class of the NonPlayerCharacter and adds variables: uniqueID
 *         and personality.
 */
public class GameCharacter {
	protected String uniqueID;
	protected String personality;

	/**
	 * Empty argument constructor and sets uniqueID and personality to ""
	 */
	public GameCharacter() {
		uniqueID = "";
		personality = "";
	}// end empty argument constructor

	/**
	 * Preferred constructor with parameters: uniqueID and personality
	 */
	public GameCharacter(String uniqueID, String personality) {
		this.uniqueID = uniqueID;
		this.personality = personality;
	}// end preferred constructor

	/**
	 * reportStructure method that prints out the Unique ID and personality
	 */
	public String reportStructure() {
		return "========================================" + "\n" + "Unique ID: " + uniqueID + "\n" + "Personality: "
				+ personality + "\n" + "========================================";
	}// end reportStructure

	/**
	 * Getter for uniqueID
	 */
	public String getUniqueID() {
		return uniqueID;
	}// end getUniqueID

	/**
	 * Setter for uniqueID
	 */
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}// end setUniqueID

	/**
	 * Getter for personality
	 */
	public String getPersonality() {
		return personality;
	}// end getPersonality

	/**
	 * Setter for personality
	 */
	public void setPersonality(String personality) {
		this.personality = personality;
	}// end setPersonality

	@Override
	/**
	 * toString method that prints out the uniqueID and personality
	 */
	public String toString() {
		return "GameCharacter [uniqueID=" + uniqueID + ", personality=" + personality + "]";
	}// end toString

}
