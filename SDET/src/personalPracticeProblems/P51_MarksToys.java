package personalPracticeProblems;

import java.util.Arrays;

public class P51_MarksToys {

	public static void main(String[] args) {
		// To find the maximum count of toys for the amount
		int[] n={1,12,5,111,200,1000,10};
		Arrays.sort(n);
		int count=0;
		int sum=0,target=50;
		int i=0;
		while (sum<=target)
		{
			sum+=n[i];
			count++;
			i++;
		}
		System.out.println(count-1);



	}

}
