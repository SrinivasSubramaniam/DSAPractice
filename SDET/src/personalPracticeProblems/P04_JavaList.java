package personalPracticeProblems;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class P04_JavaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int digits = sc.nextInt();
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 1; i <= digits; i++) {
			int number = sc.nextInt();
			list.add(number);
			
		}
		
		int query = sc.nextInt();
		for (int i = 1; i <=query ; i++) {
			String next = sc.next();
			if (next.equalsIgnoreCase("Insert"))
			{
				int pos = sc.nextInt();
				int digit = sc.nextInt();
				list.add(pos, digit);
			}
			if (next.equalsIgnoreCase("Delete"))
			{
				int pos = sc.nextInt();
				list.remove(pos);
				
			}
			
		}
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		/*5
		12 0 1 78 12
		2
		Insert
		5 23
		Delete
		0*/

	}

}
