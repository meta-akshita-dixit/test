package assignment2;

/**
 * this class contains the attributes of candidates that are
 * participating in the counselling.
 * @author Akshita Dixit
 *
 */
public class Candidate implements Comparable<Candidate> {
	
	//name of candidate
	String name;
	
	//rank of candidate
	int rank;
	
	//alloted college of candidate
	String clgOpted ;
	
	/**
	 * constructor to set details
	 * @param name
	 * @param rank
	 */
	public Candidate(String name, int rank) {
		
		this.name = name;
		this.rank = rank;
		this.clgOpted = null;
	}
	
	/**
	 * method to add college to the candidate
	 * @param clgName
	 */
	public void addCollege(String clgName) {
		
		this.clgOpted = clgName;
	}
	
	/**
	 * method to get the name of candidate
	 * @return Name of candidate
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * method to get the name of college allotted
	 * @return Name of college
	 */
	public String getClgOpted() {
		return clgOpted;
	}
   
	/**
	 * method to sort the queue using comparable interface
	 */
	public int compareTo(Candidate obj) {
		
		return this.rank > obj.rank ? 1 : -1;
	}
	

}
