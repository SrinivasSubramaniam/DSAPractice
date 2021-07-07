package personalPracticeProblems;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LearnHashMap {

	@Test
	public void internals()
	{
		String text="Srini";
		System.out.println(text.hashCode());
		
		int hashCode=text.hashCode();
		int n=16;
		int index=hashCode&(n-1);
		System.out.println(index);
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		int i=8;
		System.out.println("i "+i);
		Integer j=new Integer(8);
		System.out.println("j "+j);
		
		
		
	}

}
