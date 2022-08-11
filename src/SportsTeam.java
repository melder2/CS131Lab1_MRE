/**
 * 
 * @author Michael Elder Programming Lab 1 Problem 2 SportsTeam class creates
 *         teamName, teamMascot, headCoach, wins, and losses variable along with
 *         the constructors, getters, and setters.
 */
public abstract class SportsTeam {
	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int losses;

	/**
	 * Empty argument constructor setting teamName, teamMascot, and headCoach = "" &
	 * set wins and losses = 0
	 */
	public SportsTeam() {
		teamName = "";
		teamMascot = "";
		headCoach = "";
		wins = 0;
		losses = 0;
	}// end empty argument constructor

	/**
	 * Preferred constructor with parameters teamName, teamMascot, and headCoachr
	 */
	public SportsTeam(String teamName, String teamMascot, String headCoach) {
		super();
		this.teamName = teamName;
		this.teamMascot = teamMascot;
		this.headCoach = headCoach;
	}// end preferred constructor

	/**
	 * getWinPercentage method that returns the winPercentage
	 */
	public double getWinPercentage() {
		return (double) wins / (wins + losses);
	}// end getWinPercentage

	/**
	 * Abstract Double [] getStats method
	 */
	public abstract Double[] getStats();

	// end getStats method
	/**
	 * Getter for teamName
	 */
	public String getTeamName() {
		return teamName;
	}// end getTeamName

	/**
	 * Setter for teamName
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}// end setTeamName

	/**
	 * Getter for teamMascot
	 */
	public String getTeamMascot() {
		return teamMascot;
	}// end getTeamMascot

	/**
	 * Setter for teamMascot
	 */
	public void setTeamMascot(String teamMascot) {
		this.teamMascot = teamMascot;
	}// end setTeamMascot

	/**
	 * Getter for headCoach
	 */
	public String getHeadCoach() {
		return headCoach;
	}// end getHeadCoach

	/**
	 * Setter for headCoach
	 */
	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}// end setHeadCoach

	/**
	 * Getter for wins
	 */
	public int getWins() {
		return wins;
	}// end getWins

	/**
	 * Setter for wins
	 */
	public void setWins(int wins) {
		this.wins = wins;
	}// end setWins

	/**
	 * Getter for losses
	 */
	public int getLosses() {
		return losses;
	}// end getLosses

	/**
	 * Setter for losses
	 */
	public void setLosses(int losses) {
		this.losses = losses;
	}// end setLosses

	/**
	 * toString method printing out all of the variables in the class
	 */
	@Override
	public String toString() {
		return "SportsTeam [teamName=" + teamName + ", teamMascot=" + teamMascot + ", headCoach=" + headCoach
				+ ", wins=" + wins + ", losses=" + losses + "]";
	}// end toString method
}// end class
