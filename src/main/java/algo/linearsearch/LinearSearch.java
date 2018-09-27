package algo.linearsearch;


public class LinearSearch {

	public static int search(int[] a, int x) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x)
				return i;
		}
		return -1;
	}
	
	public static int recursiveSearch(int[]a, int i, int x) {
		if(i > a.length-1)
			return -1;
		else if (a[i] == x)
			return i;
		else
			return recursiveSearch(a, i+1, x);
	}
}
