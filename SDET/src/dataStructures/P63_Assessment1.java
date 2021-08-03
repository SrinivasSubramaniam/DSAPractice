package dataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.*;


public class P63_Assessment1 {
	/*
	 *
	 * 
	 * 
	 * 1)What is the input(s)? - 
	 * What is the expected output? 
	 * Do I have constraints to solve the problem? -
	 * Do I have all informations to go to next step!! 
	 * How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- 
	 * Negative data- 
	 * Edge Case-
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, Is there any alternate
	 * solution?-
	 *
	 * 4) Ask for the hint (If you don't know how to solve it)
	 *
	 *
	 * 5) Do I know alternate solution to solve this problem?
	 * 
	 * 6) If you know alternate solutions-> find out the O notations
	 * (performance) Then explain the both or the best (depends on the time) 1
	 * 
	 * 
	 * Approach 1-> Start with the worst -> Improve to optimize -> End up with
	 * the best Approach 2-> Write down the options and benefits and code the
	 * best
	 * 
	 * 7) Start with the Pseudo code
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails, debug them to solve it
	 *
	 *
	 *
	 * /
	 */
	@Test
    public void test1(){
		List<String> list=new ArrayList<String>();
        list.add("Can");
        list.add("Can");
        list.add("Can");
        list.add("Bin");
        list.add("Bin");
        list.add("Dog");
        list.add("Dog");
        findX(list);
        
    }
	
	/*Psuedo code
	 * 
	 * 
	 */
	private List<String> findX(List<String> list){
		List<String> outPutList=new ArrayList<String>();
		Map<String, Integer> map=new TreeMap<String,Integer>();
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i), map.getOrDefault(list.get(i),0)+1);
		}
		System.out.println(map);
		System.out.println(outPutList);
		int prevValue=Integer.MIN_VALUE;
		int listIndex=0;
		for(Map.Entry<String, Integer> each: map.entrySet()){
			if (listIndex!=0 && each.getValue()>prevValue) outPutList.add(listIndex-1,each.getKey()+ " "+each.getValue());
			else outPutList.add(listIndex,each.getKey()+ " "+each.getValue());
			prevValue=each.getValue();
			listIndex++;
		}
		System.out.println(outPutList);
		return list;
	}
}
