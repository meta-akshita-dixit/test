package assignment1_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {

	ArrayList arrayList;
	
	/**
	 * this method initializes the Array list using add function
	 */
	@Before
	public void setUp() {
		arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add(5);
		arrayList.add(3);
		arrayList.add(7);
	}
	
	/**
	 * This method tests the working of method of Add element
	 */
	@Test
	public void addElementTest() {
		int[] expected = new int[] {1,5,3,7,2};
		int[] actual = arrayList.add(2);
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * This method tests if the element is being added at given position
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void addElementAtPositionTest() {
		int[] expected = new int[] {1,5,3,6,7};
		int[] actual = arrayList.add(6 , 7);
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * This method tests if we get the element at certain position
	 */
	@Test
	public void getElementByPositionTest() {
		int expected = 1;
		int actual = arrayList.getElementByPosition(1);
		assertEquals(expected, actual);
	}
	
	/**
	 * This method tests if we get the position of the element searched
	 */
	@Test
	public void getPositionByElementTest() {
		int expected = 2;
		int actual = arrayList.getPositionByElement(5);
		assertEquals(expected, actual);
	}
	
	/**
	 * This method tests if the element is deleted at certain position
	 */
	@Test
	public void deleteByPositionTest() {
		int[] expected = new int[] {1,5,7};
		int[] actual = arrayList.deleteByPosition(3);
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * This method tests if the element passed is deleted from the array list
	 */
	@Test
	public void deleteByElementTest() {
		int[] expected = new int[] {1,3,7};
		int[] actual = arrayList.deleteByElement(5);
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * This method tests if the array list is cleared
	 */
	@Test
	public void clearAllTest() {
		int[] expected = new int[] {};
		int[] actual = arrayList.clearAll();
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * This method tests if the contents of the array gets reversed
	 */
	@Test
	public void reverseTest() {
		int[] expected = new int[] {7,3,5,1};
		int[] actual = arrayList.reverse();
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * This method tests if the content of the Array list gets sorted
	 */
	@Test
	public void sortTest() {
		int[] expected = new int[] {1,3,5,7};
		int[] actual = arrayList.sort();
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * This method tests if the two given array lists are merged
	 */
	@Test
	public void mergeTest() {
		int[] expected = new int[] {1,5,3,7,8,9,6};
		ArrayList newArrayList = new ArrayList();
		newArrayList.add(8);
		newArrayList.add(9);
		newArrayList.add(6);
		int[] actual = arrayList.merge(newArrayList);
		assertArrayEquals(expected, actual);
	}
}
