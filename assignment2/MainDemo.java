package assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainDemo {

	public static void main(String[] args) {
	
		
//		Scanner input = new Scanner(System.in);
		QueueImplementation candidateQueue = new QueueImplementation();
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
	
		Arrays.sort(candidateQueue.getQueue());
		
		List<College> collegeList = new ArrayList<College>();
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
		
		Counselling c = new Counselling();
		
		int[] input = {1, 1, 3, 3, 4, 4};
		List<String> s = c.startCounselling(collegeList, candidateQueue, input);
		
		for(String s1 :s) {
			System.out.println(s1);
		}
  }
}
