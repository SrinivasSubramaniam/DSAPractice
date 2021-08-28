package onspot;

import java.util.Arrays;

import org.junit.Test;

public class MeetingRoomsNeeded {
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
		String[][] str={{"09 00","09 45"},{"11 45","14 00"},{"10 40","12 00"},{"11 00","13 00"},
				{"09 30","10 30"},{"16 00","17 00"}};
		findMeetingRooms(str);

	}

	private int findMeetingRooms(String[][] str) {
		int[][] meeting=new int[str.length][2];
		for (int i = 0; i < str.length; i++) {
			meeting[i][0]=Integer.parseInt(str[i][0].replace(" ", ""));
			meeting[i][1]=Integer.parseInt(str[i][1].replace(" ", ""));
		}
		System.out.println(Arrays.deepToString(meeting));
		Arrays.sort(meeting,(a,b)->{
			if (a[1]!=b[1]) return a[1]-b[1];
			else return a[0]-b[0];
		});
		System.out.println(Arrays.deepToString(meeting));
		
		int start=0,end=0;
		int meetingRooms=meeting.length;
		while (start<meeting.length){
			if (meeting[start][0]>=meeting[end][1]){
				meetingRooms--;
				end++;
			}
			start++;
		}
		System.out.println(meetingRooms);
		return 0;
		
	}

}
