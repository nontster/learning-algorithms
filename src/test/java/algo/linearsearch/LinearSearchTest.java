package algo.linearsearch;

import org.junit.Assert;
import org.junit.Test;

public class LinearSearchTest {

	@Test
	public void testSearch() {
		int [] array = {1,85,12,32,89,3,69,42,1,6,8,44};
		Assert.assertEquals(4, LinearSearch.search(array, 89));
	}

}
