package algo.linearsearch;

import org.junit.Assert;
import org.junit.Test;

public class LinearSearchTest {
	int [] array = {1,85,12,32,89,3,69,42,1,6,8,44};
	@Test
	public void testLinearSearch() {
		Assert.assertEquals(4, LinearSearch.search(array, 89));
	}
	
	@Test
	public void testRecusiveLinearSearch() {
		Assert.assertEquals(4, LinearSearch.recursiveSearch(array, 0, 89));
	}

}
