package onspot;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FindTruckMax {
	
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
