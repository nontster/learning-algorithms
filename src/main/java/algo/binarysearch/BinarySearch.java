package algo.binarysearch;

public class BinarySearch {

	public static int search(int x, int[] a) {
		
		int p = 0;
		int r = a.length-1;
		int q = 0;
		
		while( p <= r) {
			q = (p+r)/2;
			
			if(a[q] < x) 
				p = q + 1;
			else if(a[q] > x)
				r = q -1;
			else
				return q;
		}
		
		return -1;
	}

}
