package personalPracticeProblems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05_JavaMapNameNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		int records=sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= records; i++) {
			String name = sc.nextLine();
			int number = sc.nextInt();
			sc.nextLine();
			map.put(name, number);
		}
		
		while (sc.hasNextLine())
		{
			String name = sc.nextLine();
			if (map.get(name)!=null) {
				System.out.println(name + "=" + map.get(name));
			}else
			{
				System.out.println("Not Valid");
			}
		}
		
		/*3
		uncle sam
		99912222
		tom
		11122222
		harry
		12299933
		uncle sam
		uncle tom
		harry*/

	}

}
