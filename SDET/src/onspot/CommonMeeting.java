package onspot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CommonMeeting {
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
		int[][] slot1={{10,50},{60,120},{140,210}};
		int[][] slot2={{0,15},{60,70}};
		int duration=8;
		System.out.println(findCommonSlots(slot1,slot2,duration));
	}
	@Test
	public void test2() {
		int[][] slot1={{10,15},{60,120},{140,210}};
		int[][] slot2={{10,15},{60,70}};
		int duration=8;
		System.out.println(findCommonSlots(slot1,slot2,duration));
	}

	private List<Integer> findCommonSlots(int[][] slots1, int[][] slots2,int duration) {
		Arrays.sort(slots1, (a,b)-> a[0]-b[0]);
        Arrays.sort(slots2, (a,b)-> a[0]-b[0]);
        int left = 0,right=0;

        while (left < slots1.length && right < slots2.length) {
            int start = Math.max(slots1[left][0], slots2[right][0]);
            int end = Math.min(slots1[left][1], slots2[right][1]);

            if (end - start >= duration) 
            	return Arrays.asList(start,start+duration);
            else if (slots1[left][1] < slots2[right][1]) left++;
            else right++;
        }
		return new ArrayList<>();
		
		
	}

}




/*if (slots2[right][1] < slots1[left][1]) right++;
else {
   left++;
   right++;
}*/
