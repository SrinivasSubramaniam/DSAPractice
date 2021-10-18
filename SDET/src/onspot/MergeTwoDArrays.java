package onspot;

import java.util.ArrayList;
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
		System.out.println(Arrays.deepToString(merge(arr)));
	}

	private int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (i, j) -> {
			if (i[0] != j[0])
				return i[0] - j[0];
			else
				return i[1] - j[1];
		});
		System.out.println();
		List<int[]> list = new ArrayList<>();
		int startTime = intervals[0][0], endTime = intervals[0][1];
		for(int i = 1; i < intervals.length; i++){
			if(endTime>=intervals[i][0]){
				endTime = Math.max(endTime, intervals[i][1]);
			}
			else {
				list.add(new int[] {startTime,endTime});
				startTime = intervals[i][0];
				endTime =  intervals[i][1];
			}
		}
		list.add(new int[] {startTime,endTime});
		int[][] array = list.toArray(new int[list.size()][]);
		/*int[][] retArr = new int[list.size()][2];
		int index  = 0; 
		for (List<Integer> eachList : list) {
			retArr[index][0] = eachList.get(0);
			retArr[index++][1] = eachList.get(1);
		}*/
		return array;
	}


}
