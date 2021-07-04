package personalPracticeProblems;

public class P46_MaxSubArray {

	public static void main(String[] args) {
		// To find the maximum value of sub array
		int[] nums={-2,1,-3,4,-1,2,1,-5,4};
		int sum=0;
		int max=0;
		for (int i = 0; i < nums.length; i++) {
			sum=nums[i];
			for (int j = i+1; j < nums.length; j++) {
				 sum+=nums[j];
				 if (sum>max)
				 {
					 max=sum;
				 }
				
			}
		}
		System.out.println(max);

	}

}
