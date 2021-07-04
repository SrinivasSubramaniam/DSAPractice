package personalPracticeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class P71ArrayUncommon2V3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1={1,2,4,6};
		int[] ar2={2,2,6,8,10};
		int[] temp= new int[5];
		int prev;
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		int k=0;
		for (int i = 0; i < ar1.length; i++) {
			boolean flag = true;
			if (ar1[i]!=ar2[i])
			{
				temp[k++]=ar1[i];
				
			}
		}
		
		

	}

}
