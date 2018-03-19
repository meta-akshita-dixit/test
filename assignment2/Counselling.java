package assignment2;

import java.util.ArrayList;
import java.util.List;

/**
 * this class performs the counseling process
 * @author Akshita Dixit
 *
 */
public class Counselling {
	
	//queue to store candidates after college have been allotted
	QueueImplementation allottedColleges;
	
	/**
	 * this method is assigning the college as per the candidate's choice
	 * @param collegeList - list of colleges
	 * @param candidateQueue - queue having candidates based on their ranking
	 * @param inputChoice - array having choices of candidate
	 * @return
	 */
	public List<String> startCounselling(List<College> collegeList, QueueImplementation candidateQueue, int[] inputChoice) {
		
		//list of candidates after college is allotted
		List<String> outputListofCandidates = new ArrayList<>();

		//loop to iterate over the queue of candidates
		for(int i = 0; i < candidateQueue.getQueue().length; i++) {
			
			//to manage the total available seats
			int seatCount = 0;
			
			//for each loop to get the total seats
			for(College college : collegeList) {
				
				seatCount += college.getSeats();
			}
			
			//if all seats are blocked
			if(seatCount == 0) {
				
				//iterating for unallotted candidates
				for(int j = i; j < candidateQueue.getQueue().length; j++) {
					
					outputListofCandidates.add(((Candidate) candidateQueue.dequeue()).getName() +' '+ null);
				}
				break;
			}
			
			//if seat for particular college is 0
			if(collegeList.get(inputChoice[i] - 1).getSeats() == 0) {
				
				//getting back to same candidate to get another choice
				i--;
				continue;
			} else {
				
				//updating seats and college name for college and candidate
				Candidate currentCandidate = (Candidate) candidateQueue.dequeue();
				currentCandidate.addCollege(collegeList.get(inputChoice[i] - 1).getName());
				outputListofCandidates.add(currentCandidate.getName() +' '+ currentCandidate.getClgOpted());
				collegeList.get(inputChoice[i] - 1).updateSeats();
			}
		}
		
		return outputListofCandidates;
		
	}
}
