package personalPracticeProblems;

import java.util.Arrays;

public class P27_MissedSequenceAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n={1};
		Arrays.sort(n);
		int count=0;
		for (int i = 0; i < n.length-1; i++) {
			if (n[i+1]-n[i]>1)
			{
				count=n[i+1]-1;
				break;
			}
			
		}
		System.out.println(count);

	}

}
