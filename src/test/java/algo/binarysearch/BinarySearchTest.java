/**
 * 
 */
package algo.binarysearch;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;



/**
 * @author Nont Banditwong
 *
 */
public class BinarySearchTest {


	/**
	 * Test method for {@link algo.binarysearch.BinarySearch#search(int, int[])}.
	 */
	@Test
	public void testBinarySearch() {
		int [] array = {85,99,12,32,89,3,69,42,1,6,8,44};
		Arrays.sort(array);
		Assert.assertEquals(5, BinarySearch.search(32, array));
	}

	/**
	 * Test method for {@link algo.binarysearch.BinarySearch#recursiveSearch(int, int, int, int[])}.
	 */
	@Test
	public void testRecursiveBinarySearch() {
		int [] array = {85,99,12,32,89,3,69,42,1,6,8,44};
		Arrays.sort(array);
		Assert.assertEquals(5, BinarySearch.recursiveSearch(32, 0, array.length-1, array));
	}
}
