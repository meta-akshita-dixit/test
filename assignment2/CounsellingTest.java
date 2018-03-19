package assignment2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * this class contains various test cases to test counselling process
 * @author Akshita Dixit
 *
 */
public class CounsellingTest {
	
	//queue for candidates
	QueueImplementation candidateQueue;
	//list of colleges
	List<College> collegeList;
	//updated list of candidates
	QueueImplementation allottedColleges;
	//object of counselling
	Counselling c;
	
	/**
	 * initializing the candidateQueue and collegeList
	 */
	@Before
	public void init() {
		
		candidateQueue = new QueueImplementation();
		Candidate c1 = new Candidate("akshita", 10);
		candidateQueue.enqueue(c1);
		Candidate c2 = new Candidate("saloni", 2);
		candidateQueue.enqueue(c2);
		Candidate c3 = new Candidate("jaya", 3);
		candidateQueue.enqueue(c3);
		Candidate c4 = new Candidate("mansi", 4);
		candidateQueue.enqueue(c4);
		Candidate c5 = new Candidate("manisha", 1);
		candidateQueue.enqueue(c5);
		Candidate c6 = new Candidate("anshul", 22);
		candidateQueue.enqueue(c6);
		Candidate c7 = new Candidate("animesh", 29);
		candidateQueue.enqueue(c7);
		Candidate c8 = new Candidate("amit", 30);
		candidateQueue.enqueue(c8);
		Candidate c9 = new Candidate("vinod", 31);
		candidateQueue.enqueue(c9);
		Candidate c10 = new Candidate("satyam", 34);
		candidateQueue.enqueue(c10);
		
		//sorting the queue
		Arrays.sort(candidateQueue.getQueue());
		
		collegeList = new ArrayList<College>();
		College clg1 = new College("clg 1", 2);
		collegeList.add(clg1);
		College clg2 = new College("clg 2", 1);
		collegeList.add(clg2);
		College clg3 = new College("clg 3", 2);
		collegeList.add(clg3);
		College clg4 = new College("clg 4", 2);
		collegeList.add(clg4);
		College clg5 = new College("clg 5", 0);
		collegeList.add(clg5);
		
		allottedColleges = new QueueImplementation();
		
		c = new Counselling();
	}

	/**
	 * test case to check if the allocation of candidates is as per
	 * expected
	 */
	@Test
	public void testResultSuccess() {
		
		int[] input = {1, 1, 2, 3, 3, 4, 4};
		List<String> actualAllocation = c.startCounselling(collegeList, candidateQueue, input);
		
		List<String> expectedAllocation = new ArrayList<>();
		expectedAllocation.add("manisha clg 1");
		expectedAllocation.add("saloni clg 1");
		expectedAllocation.add("jaya clg 2");
		expectedAllocation.add("mansi clg 3");
		expectedAllocation.add("akshita clg 3");
		expectedAllocation.add("anshul clg 4");
		expectedAllocation.add("animesh clg 4");
		expectedAllocation.add("amit null");
		expectedAllocation.add("vinod null");
		expectedAllocation.add("satyam null");
		
		assertEquals(expectedAllocation, actualAllocation);
		
	}
	
	/**
	 * test case to check if it is working for negative cases or not
	 */
	@Test
	public void testResultFailure() {
		int[] input = {1, 1, 2, 3, 3, 4, 4};
		List<String> actualAllocation = c.startCounselling(collegeList, candidateQueue, input);
		
		List<String> expectedAllocation = new ArrayList<>();
		expectedAllocation.add("manisha clg 1");
		expectedAllocation.add("saloni clg 1");
		expectedAllocation.add("jaya clg 2");
		expectedAllocation.add("mansi clg 3");
		expectedAllocation.add("anshul clg 4");
		expectedAllocation.add("animesh clg 4");
		expectedAllocation.add("amit null");
		expectedAllocation.add("vinod null");
		expectedAllocation.add("satyam null");
		
		assertNotEquals(expectedAllocation, actualAllocation);
	}
	
	/**
	 * test case to check exception
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testException() {
		
		//no of seats left unallotted
		int[] input = {1, 1, 2, 3, 3, 4};
		c.startCounselling(collegeList, candidateQueue, input);
	}

}
