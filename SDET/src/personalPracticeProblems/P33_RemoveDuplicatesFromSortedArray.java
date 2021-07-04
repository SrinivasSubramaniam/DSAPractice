package personalPracticeProblems;

public class P33_RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		//Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
		int[] n={0,0,1,1,1,2,2,3,3,4};
		int i=0;
		for (int j = 1; j < n.length; j++) {
			if (n[i]!=n[j])
			{
				i++;
				n[i]=n[j];
			}
		}
		System.out.println(i+1);

	}

}
