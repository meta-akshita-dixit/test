package assignment2;

/**
 * this class contains the attributes of colleges that are
 * participating in the counselling.
 * @author Akshita Dixit
 *
 */
public class College {
	
	//name of college
	String name;
	
	//no of seats in college
	int seats;
	
	/**
	 * constructor to set details
	 * @param name
	 * @param seats
	 */
	public College(String name, int seats) {
		super();
		this.name = name;
		this.seats = seats;
	}

	/**
	 * method to update the seats for partiular college
	 */
	public void updateSeats() {
		this.seats = this.seats - 1;
	}

	/**
	 * method to get the name of college
	 * @return Name of college
	 */
	public String getName() {
		return name;
	}

	/**
	 * method to get the seats of college
	 * @return seats
	 */
	public int getSeats() {
		return seats;
	}
	
	/**
	 * method to display the college name and seats available
	 * @return String
	 */
	public String displayCollegeDetails() {
		
		return this.name + "  " + this.seats;
		 
		
	}
	
}
