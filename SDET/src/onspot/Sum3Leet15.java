package onspot;

import java.util.*;

import org.junit.Test;

public class Sum3Leet15 {
	@Test
	public void test1(){
		int[] arr={-1,0,1,2,-1,-4};
		System.out.println(threeSum(arr));
	}
	
	 public List<List<Integer>> threeSum(int[] nums) {
	        Set<List<Integer>> list=new HashSet<List<Integer>>();
	        Arrays.sort(nums);
	        for (int i=0;i<nums.length-2;i++){
	            int j=i+1;
	            int k=nums.length-1;
	            while (j<k){
	                int sum=nums[i]+nums[j]+nums[k];
	                if (sum==0) list.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
	                else if (sum>0) k--;
	                else if (sum<0) j++;
	            }
	        }
	        return new ArrayList<>(list);        
	    }

}
