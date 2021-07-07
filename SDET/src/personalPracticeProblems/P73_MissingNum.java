package personalPracticeProblems;

import java.util.ArrayList;
import java.util.List;

public class P73_MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums = { 1, 2, 4, 5, 6 };
		for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);
            if (nums[index - 1] > 0) {
                nums[index - 1] *= -1;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
       
	}

}
