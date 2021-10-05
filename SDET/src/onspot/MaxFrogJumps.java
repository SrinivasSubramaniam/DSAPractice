package onspot;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

public class MaxFrogJumps {

	@Test
	public void example1() {
		int[] nums = {6,13,10,8,11,7,3,5,2};
		System.out.println(maxFrogJumpsBSA(nums));
		System.out.println();
	}
	
	@Test
	public void example2() {
		int[] nums = {6,4,5,4,3,2,1};
		System.out.println(maxFrogJumpsBSA(nums));
		System.out.println();
	}
	
	@Test
	public void example3() {
		int[] nums = {5,7,11,9,10,7,6,3,5,2,1};
		System.out.println(maxFrogJumpsBSA(nums));
		System.out.println();
	}
	
	@Test
	public void example4() {
		int[] nums = {5,7,16,9,10,15,14,13,12,7,6,3,5,2,1};
		System.out.println(maxFrogJumpsBSA(nums));
		System.out.println();
	}
	
public int maxFrogJumpsMyBrute(int[] nums){
		int max=Integer.MIN_VALUE;
		for (int i=0;i<nums.length;i++){
			int temp=nums[i];
			int tempMax=0;
			for (int j=1;j<nums.length;j++){
				if (nums[j]<temp){
					tempMax++;
					temp=nums[j];					
				}
			}
			max=Math.max(tempMax, max);
		}
		
		return max;
	}
	public int maxFrogJumpsBrute(int[] nums){
		
		int[] data = new int[nums.length];
        Arrays.fill(data, 0);
        //System.out.println(Arrays.toString(data));
        
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] < nums[j]){
                    data[i] = Math.max(data[i], data[j]+1);
                }
            }
            System.out.println(Arrays.toString(data));
        }
        System.out.println(Arrays.toString(data));
        
        int maxJumps = 0;
        for (int each : data) {
            maxJumps = Math.max(maxJumps, each);
        }
        
        return maxJumps;
	}
	public int maxFrogJumps(int[] nums){
		ArrayList<Integer> sub = new ArrayList<>();
		sub.add(nums[0]);

		for (int i = 1; i < nums.length; i++) {
			int num = nums[i];
			if (num < sub.get(sub.size() - 1)) {
				sub.add(num);
			} else {
				// Find the first element in sub that is greater than or equal to num
				int j = 0;
				while (num < sub.get(j)) {
					j += 1;
				}
				if(j == sub.size()-1)
					sub.set(j, num);
			}
		}

		return sub.size()-1;
	}
	public int maxFrogJumpsBSA(int[] nums){
		ArrayList<Integer> sub = new ArrayList<>();
		sub.add(nums[0]);
		for (int i = 1; i < nums.length; i++) {
			int num = nums[i];
			if (num < sub.get(sub.size() - 1)) {
				sub.add(num);
			} else {
				// Find the first element in sub that is greater than or equal to num
				int j = binarySearch(sub, num);
				if(j == sub.size()-1)
					sub.set(j, num);
			}
		}
		return sub.size()-1;
	}

	private static int binarySearch(ArrayList<Integer> sub, int num) {
        int left = 0;
        int right = sub.size() - 1;
        int mid = (left + right) / 2;
        
        while (left < right) {
            mid = (left + right) / 2;
            if (sub.get(mid) == num) {
                return mid;
            }
            
            if (num < sub.get(mid)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }

	
}
