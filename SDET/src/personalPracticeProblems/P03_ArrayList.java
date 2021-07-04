package personalPracticeProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class P03_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int listcount = sc.nextInt();
		ArrayList<Integer> ar[]=new ArrayList[2002];
		
		for (int i = 1; i <= listcount; i++) {
			ar[i]=new ArrayList<>();
			int digitsCount = sc.nextInt();
			for (int j = 1; j <= digitsCount; j++) {
				int digit = sc.nextInt();
				ar[i].add(digit);
				
			}
		}
		int query = sc.nextInt();
		for (int i = 1; i <=query; i++) {
			int line = sc.nextInt();
			int pos = sc.nextInt();
			try {
				System.out.println(ar[line].get(pos-1));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("ERROR!");
			}
			
		}

	}

}
