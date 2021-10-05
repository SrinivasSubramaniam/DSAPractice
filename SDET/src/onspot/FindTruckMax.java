package onspot;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FindTruckMax {
	
	/*
	 * You are assigned to put some amount of boxes onto one truck. You are
	 * given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi,
	 * numberOfUnitsPerBoxi]:
	 * 
	 * numberOfBoxesi is the number of boxes of type i. numberOfUnitsPerBoxi is
	 * the number of units in each box of the type i. You are also given an
	 * integer truckSize, which is the maximum number of boxes that can be put
	 * on the truck. You can choose any boxes to put on the truck as long as the
	 * number of boxes does not exceed truckSize.
	 * 
	 * Return the maximum total number of units that can be put on the truck.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4 Output: 8
	 * Explanation: There are: - 1 box of the first type that contains 3 units.
	 * - 2 boxes of the second type that contain 2 units each. - 3 boxes of the
	 * third type that contain 1 unit each. You can take all the boxes of the
	 * first and second types, and one box of the third type. The total number
	 * of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8. Example 2:
	 * 
	 * Input: boxTypes = [[5,10],[2,5],[4,7],[3,9]], truckSize = 10 Output: 91
	 * 
	 */
	
	@Test
	public void test1(){
		int[][] truck ={{5,10},{2,5},{4,7},{3,9}};
		int truckSize=10;
		Assert.assertEquals(findTruckSize(truck,truckSize),91);
	}
	@Test
	public void test2(){
		int[][] truck ={{1,3},{2,2},{3,1}};
		int truckSize=4;
		Assert.assertEquals(findTruckSize(truck,truckSize),8);
	}
	
	/*
	 * Psuedo code
	 * 
	 * Sort the array in numberOfUnitsPerBoxi descending
	 * int TruckLoaded as 0
	 *  iterate the array and subtract the truck size with number of numberOfBoxesi 
	 *  		add the number of boxes to the truck load if the value is less than the value truck size then add 
	 *  		else iterate the value from 1 to till the number of values
	 *  				if the value is equal then return 
	 * 
	 */
	
	private int findTruckSize(int[][] truck, int truckSize) { // return type should be int
		Arrays.sort(truck, (a, b) -> b[1] - a[1]); // sort by array index 1 / units
		System.out.println(Arrays.deepToString(truck));
		int truckLoadedSum=0;
		int i=0;
		while(truckSize>0){
			if (truckSize<truck[i][0]) {
				truckLoadedSum+=(truckSize)*truck[i][1];
				break;
			}
			else truckLoadedSum+=truck[i][0]*truck[i][1];
			truckSize-=truck[i][0];
			i++;
		}
		return truckLoadedSum;
	}

	private int findTruckSizeOriginal(int[][] truck, int truckSize) { // return type should be int
		Arrays.sort(truck, (a, b) -> b[1] - a[1]); // sort by array index 1 / units
		System.out.println(Arrays.deepToString(truck));
		int truckLoaded = 0;
		int truckLoadedSum = 0;
		boolean flag = true;
		for (int i = 0; i < truck.length; i++) {
			if (truckLoaded + truck[i][0] <= truckSize) {
				truckLoaded += truck[i][0];
				truckLoadedSum += truck[i][0] * truck[i][1];
			} else {
				
				truckLoadedSum +=(truckSize-truckLoaded)*truck[i][1];
				break;
				
			}
		}
		return truckLoadedSum;
	}
	

}
