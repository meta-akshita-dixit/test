package assignment2;

import java.util.Arrays;

/**
 * This class contains various methods to show implementation of queue
 * @author Akshita Dixit
 *
 */
public class QueueImplementation {
	
	//array of object type
	Object[] queueArray ;
	int rear, front;
	
	/**
	 * constructor to initialize array and front and rear
	 */
	public QueueImplementation() {
		queueArray = new Object[0];
		 this.front = -1;
		 this.rear = -1;
	}

	/**
	 * method to add element in the queue
	 * @param item -object to be added
	 */
	public void enqueue(Object item) {

		//new temporary array
		Object[] newArray;
		
	    //copies existing array to temp array
		newArray = Arrays.copyOf(queueArray, queueArray.length+1);
		
		//adding element at the end of the list
		 if(this.front == -1) {
			 this.front++;
			 this.rear++;
			 newArray[this.front] = item;
		 } else {
			 newArray[++this.rear] = item;
		 }
		 
		//Referencing arraylist to reflect updated array
		queueArray = newArray;
				
	}
	 
	 /**
	  * method to remove element from the queue
	  * @return object dequeued
	  */
	 public Object dequeue() {
		 
		Object item = new Object();
		
		//boundary condition
		if(front == -1 || front > rear) {
			throw new ArrayIndexOutOfBoundsException();
		} else if(front <= rear) {
			item = queueArray[front];
			front++;
		}
		return item;
	 }
	 
	 /**
	  * method to get the object at front of queue
	  * @return object at front
	  */
	 public Object getFront( ) {
		 
		 Object item = new Object();
		 
		//boundary condition
		 if(front == -1 || front > rear) {
				throw new ArrayIndexOutOfBoundsException();
			} else if(front <= rear){
				item = queueArray[front];
			}
		return item;
	 }
	 
	 /**
	  * method to empty the queue by making front and rear -1
	  */
	 public void makeEmpty( ) {
		 
		while(front < rear) {
			
			//boundary condition
			if(front == -1) {
				
				throw new ArrayIndexOutOfBoundsException();
				
			} else if(front <= rear) {
				
				front++;
			}
			front = rear = -1;
		}
	 }
	  
	 /**
	  * method to get value of rear
	  * @return int value of rear
	  */
	  public int getRear() {
			return rear;
	  }
	  
	  /**
	   * method to get object from the queue
	   * @param index - position of element to be searched
	   * @return
	   */
	  public Object getElement(int index) {
		  
		  return queueArray[index];
	  }
	  
	  /**
	   * method to get the queue of objects
	   * @return
	   */
	  public Object[] getQueue() {
		  return this.queueArray;
	  }

}
