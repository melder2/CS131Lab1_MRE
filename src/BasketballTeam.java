/**
 * 
 * @author Michael Elder Programming Lab 1 Problem 2 
 * 			BasketballTeam class extends SportsTeam class, creates additional variables, and implemented the getStats method.
 *         
 */
public class BasketballTeam extends SportsTeam {
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;

	/**
	 * Empty argument constructor calling the super constructor and setting
	 * fieldGoals, fieldGoalsAttempted, freeThrows, and freeThrowsAttempted = 0
	 */
	public BasketballTeam() {
		super();
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
	}// end empty argument constructor

	/**
	 * Preferred constructor with parameters: teamName, teamMascot, headCoach, wins,
	 * losses, fieldGoals, fieldGoalsAttempted, freeThrows, and freeThrowsAttempted
	 */
	public BasketballTeam(String teamName, String teamMascot, String headCoach, int wins, int losses, int fieldGoals,
			int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {

		super(teamName, teamMascot, headCoach);
		super.wins = wins;
		super.losses = losses;
		this.fieldGoals = fieldGoals;
		this.fieldGoalsAttempted = fieldGoalsAttempted;
		this.freeThrows = freeThrows;
		this.freeThrowsAttempted = freeThrowsAttempted;
	}// end preferred constructor

	/**
	 * getStats method returning an array with winPercentage, fieldGoalPercentage,
	 * and freeThrowPercentage
	 */
	@Override
	public Double[] getStats() {
		Double[] array = { (double) (getWinPercentage()), (double) (fieldGoalPercentage()),
				(double) (freeThrowPercentage()) };
		return array;
	}// end getStats method

	/**
	 * setStats method with parameters: wins, losses, fieldGoals,
	 * fieldGoalsAttempted, freeThrows, and freeThrowsAttempted
	 */
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows,
			int freeThrowsAttempted) {
		this.wins = wins;
		this.losses = losses;
		this.fieldGoals = fieldGoals;
		this.fieldGoalsAttempted = fieldGoalsAttempted;
		this.freeThrows = freeThrows;
		this.freeThrowsAttempted = freeThrowsAttempted;
	}// end setStats method

	/**
	 * freeThrowPercentage method that returns freeThrows/freeThrowsAttempted
	 */
	public double freeThrowPercentage() {
		return (double) freeThrows / freeThrowsAttempted;
	}// end freeThrowPercentage method

	/**
	 * fieldGoalPercentage method that returns fieldGoals/fieldGoalsAttempted
	 */
	public double fieldGoalPercentage() {
		return (double) fieldGoals / fieldGoalsAttempted;
	}// end fieldGoalPercentage method
	
	/**
	 * Getter for fieldGoals
	 */
	public int getFieldGoals() {
		return fieldGoals;
	}// end getFieldGoals

	/**
	 * Setter for fieldGoals
	 */
	public void setFieldGoals(int fieldGoals) {
		this.fieldGoals = fieldGoals;
	}// end setFieldGoals

	/**
	 * Getter for fieldGoalsAttempted
	 */
	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}// end getFieldGoalsAttempted

	/**
	 * Setter for fieldGoalsAttempted
	 */
	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}// end setFieldGoalsAttempted

	/**
	 * Getter for freeThrows
	 */
	public int getFreeThrows() {
		return freeThrows;
	}// end getFreeThrows

	/**
	 * Setter for freeThrows
	 */
	public void setFreeThrows(int freeThrows) {
		this.freeThrows = freeThrows;
	}// end setFreeThrows

	/**
	 * Getter for freeThrowsAttempted
	 */
	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}// end getFreeThrowsAttempted

	/**
	 * Setter for freeThrowsAttempted
	 */
	public void setFreeThrowsAttempted(int freeThrowsAttempted) {
		this.freeThrowsAttempted = freeThrowsAttempted;
	}// end setFreeThrowsAttempted

	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "BasketballTeam [fieldGoals=" + fieldGoals + ", fieldGoalsAttempted=" + fieldGoalsAttempted
				+ ", freeThrows=" + freeThrows + ", freeThrowsAttempted=" + freeThrowsAttempted + ", teamName="
				+ teamName + ", teamMascot=" + teamMascot + ", headCoach=" + headCoach + ", wins=" + wins + ", losses="
				+ losses + "]";
	}// end toString method
}// end class
