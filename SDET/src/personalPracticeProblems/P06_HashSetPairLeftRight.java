package personalPracticeProblems;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P06_HashSetPairLeftRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5
		john tom
		john mary
		john tom
		mary anna
		mary anna*/
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		Set<String> set = new LinkedHashSet<String>();
		
		for (int i = 1; i <= input; i++) {
			String firstname=sc.next();
			String lastname=sc.next();
			set.add(firstname+" "+lastname);
			System.out.println(set.size());
			
		}

	}

}
