package onspot;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MergeTwoDArrays {
	
	/*
	 * 
	 * 1) Input-
	 * Output -  
	 * Constraints- 
	 *
	 * 2) Test Data
	 *
	 * Positive data -
	 * Negative data
	 * Edge Case
	 * 
	 * 3) Methods to Solve-
	 * 
	 * 4) O Notations-
	 * 
	 * 5) Psuedo code
	 */

	/*
	 * 
	 *
	 * 
	 * PsuedoCode: 
	 * Code: 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void test1() {
		int[][] arr={{1,3},{2,4},{6,9}};
		merge(arr);
	}

	private void merge(int[][] arr) {
		Arrays.sort(arr,(a,b)->{
			return a[0]-b[0];
		});
		System.out.println(Arrays.deepToString(arr));
		List<int[]> list = Arrays.asList(arr);
		list.toArray(new int[2][]);
		int[] is = list.get(0);
		System.out.println(is[0]);
	}


}
