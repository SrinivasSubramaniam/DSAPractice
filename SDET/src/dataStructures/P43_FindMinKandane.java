package dataStructures;

import org.junit.Assert;
import org.junit.Test;

public class P43_FindMinKandane {
	@Test
    public void test1(){
        int[] nums={1,2,-5,-3,2,-8,7};
        int result= -8;
        Assert.assertEquals(findMinusingKandane(nums),result);
    }
    @Test
    public void test2(){
        int[] nums={-1,-2,-5,-3,-12};
        int result= -23;
        Assert.assertEquals(findMinusingKandane(nums),result);
    }
    @Test
    public void test3(){
        int[] nums={1,2,5,3,12,1};
        int result= 1;
        Assert.assertEquals(findMinusingKandane(nums),result);
    }
    private int findMinusingKandane(int[] nums) {
        if(nums.length==0)
            throw new RuntimeException("Empty array");
        int windowSum=nums[0], minSum=nums[0];
        for (int i=1;i<nums.length;i++){
           windowSum= Math.min(windowSum+nums[i],nums[i]);
           minSum=Math.min(minSum,windowSum);
        }
        return minSum;
    }
}
