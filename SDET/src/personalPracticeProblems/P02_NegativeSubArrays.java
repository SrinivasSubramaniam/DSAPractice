package personalPracticeProblems;

import java.util.Scanner;

public class P02_NegativeSubArrays {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int digits = sc.nextInt();
		int[] ar=new int[digits];
		for (int i = 0; i < digits; i++) {
			int digi = sc.nextInt();
			ar[i]=digi;
			
		}
		int count=0;
		int sum;
		for (int i = 0; i < ar.length; i++) {
			sum=ar[i];
			if (sum<0)
			{
				count++;
			}
			for (int j = i+1; j < ar.length; j++) {
				sum+=ar[j];
				if (sum<0)
				{
					count++;
				}
			}
			
			
		}
		System.out.println(count);

	}

}
