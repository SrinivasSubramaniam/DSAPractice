package slidingWindow;

import org.junit.*;

public class AltitudeBike1732 {
	
	@Test
	public void test1(){
		int[] nums={-5,1,5,0,-7};
		Assert.assertEquals(1, largestAltitude(nums));
	}
	
	/*Psuedo code
	 * 
	 * Create a sum and max varaible 
	 * Iterate the array
	 * add each value to sum 
	 * calculate the max value
	 * 
	 * Time complexity - O(n)
	 * Space Complexity - O(1)
	 * 
	 * Time
	 * Pseudoe code- 2 mins
	 * Code - 5 mins
	 * 
	 * 
	 * 
	 */
	
	
	public int largestAltitude(int[] gain) {
	       /* int max=0,totalSum=0;
	        for (int i=1;i<gain.length;i++){
	            gain[i]+=gain[i-1];
	        }
	        Arrays.sort(gain);
	        max=Math.max(max,gain[gain.length-1]);
	        return max; */
	        
	        int sum=0,max=0;
	        for (int i=0;i<gain.length;i++){
	            sum+=gain[i];
	            max=Math.max(sum,max);
	        }
	        return max;
	        
	    }

}
