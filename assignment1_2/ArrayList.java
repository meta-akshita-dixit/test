package assignment1_2;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * This class implements the use of arraylist having various properties
 * of arraylist.
 * @author 
 *
 */
public class ArrayList {

	//int array
	int[] arrayList; 
	
	/**
	 * Constructor of arraylist 
	 */
	public ArrayList() {
		
		//initializes arraylist with size 0
		arrayList = new int[0];
	}
	
	/**
	 * method to add new element in the arraylist
	 * @param element - item to be added
	 * @return arraylist- updated arraylist
	 */
	public int[] add(int element) {
		
		//new temporary array
		int[] newArray;
		//copies existing array to temp array
		newArray = Arrays.copyOf(arrayList, arrayList.length+1);
		//adding element at the end of the list
		newArray[arrayList.length] = element;
		//Referencing arraylist to reflect updated array
		arrayList = newArray;
		return arrayList;
	}
	
	/**
	 * method that adds new element at a given position
	 * @param element - item to be added
	 * @param position-at which position to be added
	 * @return arraylist- updated arraylist
	 */
	public int[] add(int element , int position) {
		
		//to check if given position is valid or not
		if(position <= arrayList.length && position > 0) {
			//new temporary array
			int[] newArray = new int[arrayList.length+1];
			//iterator variable
			int i = 0;
			//loop to copy elements till position-1 to temp array
			for( ; i < position-1 ; i++) {
				newArray[i] = arrayList[i];
			}
			//adding element at given position
			newArray[i++] = element;
			//loop to copy elements from position to end of arraylist to temp array
			for( ; i < newArray.length ; i++) {
				newArray[i] = arrayList[i-1];
			}
			//Referencing arraylist to reflect updated array
			arrayList = newArray;
			return arrayList;
		} else { //throw error if position not valid
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	/**
	 * method to get element by passing position
	 * @param position - position of element to be found
	 * @return int - element at given index
	 */
	public int getElementByPosition(int position) {
		
		//to check if given position is valid or not
		if(position <= arrayList.length && position > 0) {
			return arrayList[position-1];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	/**
	 * method to get position by passing element
	 * @param element-element whose position is to be found
	 * @return position
	 */
	public int getPositionByElement(int element) {
		
		//to check the position of element in the array
		for(int i = 0 ; i < arrayList.length ; i++) {
			if(element == arrayList[i]) {
				return i+1;
			}
		}
		//if element does not exists
		throw new NoSuchElementException();
	}
	
	/**
	 * method to delete element at given position
	 * @param position 
	 * @return arrayList - updated arraylist
	 */
	public int[] deleteByPosition(int position) {
		
		//to check if given position is valid or not
		if(position <= arrayList.length && position > 0) {
			//temp array to store arraylist after deleting element
			int[] newArray = new int[arrayList.length-1];
			//iterator variable
			int i = 0;
			//to copy elements before the position given
			for( ; i < position-1 ; i++) {
				newArray[i] = arrayList[i];
			}
			//to copy elements after postion to be deleted
			for( i = position ; i < arrayList.length ; i++) {
				newArray[i-1] = arrayList[i];
			}
			//updating arraylist reference
			arrayList = newArray;
			return arrayList;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	/**
	 * method to delete element by passing its value
	 * @param element-to be deleted
	 * @return arrayList - updated arraylist
	 */
	public int[] deleteByElement(int element) {
		
		//temp array to store arraylist after deleting element
		int[] newArray = new int[arrayList.length-1];
		//iterator variable
		int i = 0;
		int flag = 0;
		//to check the position of element in the array
		for( ; i < arrayList.length ; i++) {
			if(arrayList[i] == element) {
				//if element found in array set flag
				flag = 1;
				break;
			}
		}
		//if element not found
		if(flag == 0){
			throw new NoSuchElementException();
		}
		//calling method to delete the element by position
		arrayList = deleteByPosition(i+1);
		return arrayList;
	}
	
	/**
	 * method to clear the arraylist
	 * @return empty list
	 */
	public int[] clearAll() {
		arrayList = new int[0]; 
		return arrayList;
	}
	
	/**
	 * method to reverse the arraylist
	 * @return arrayList - updated arraylist
	 */
	public int[] reverse() {
		
		int temp;
		//loop to iterate till half arraylist
		for(int i = 0 ; i < arrayList.length/2 ; i++) {
			//swaaping elements as 0 with size-1, 1 with size-2 etc.
			temp = arrayList[i];
			arrayList[i] = arrayList[arrayList.length - i - 1];
			arrayList[arrayList.length - i - 1] = temp;
		}
		return arrayList;
	}
	
	/**
	 * method to sort arraylist
	 * @return arrayList - updated arraylist
	 */
	public int[] sort() {
		Arrays.sort(arrayList);
		return arrayList;
	}
	
	/**
	 * method to merge to arraylists
	 * @param newArrayList
	 * @return merged arraylist
	 */
	public int[] merge(ArrayList newArrayList) {
		
		//new array to store to the arrays
		int[] newArray = new int[arrayList.length + newArrayList.arrayList.length];
		//iterator variable
		int i = 0;
		//loop to copy existing arraylist 
		for( ; i < arrayList.length ; i++) {
			newArray[i] = arrayList[i];
		}
		//loop to copy passed arraylist
		for(i = 0 ; i < newArrayList.arrayList.length ; i++) {
			newArray[i + arrayList.length ] = newArrayList.arrayList[i];
		}
		arrayList = newArray;
		return arrayList;
	}
	
}