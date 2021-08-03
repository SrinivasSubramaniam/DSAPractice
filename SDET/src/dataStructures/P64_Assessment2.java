package dataStructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.*;
import org.junit.runner.Result;


public class P64_Assessment2 {
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
	
	
	/*Psuedo code
	 * 
	 * 
	 */
	public static List<String> groupTransactions(List<String> transactions) {
	    // Write your code here
	    
	    Map<String,Integer> map =new HashMap<String,Integer>();
	    List<String> outPutlist=new ArrayList<String>();
	    for(int i=0;i<transactions.size();i++){
	        if (map.containsKey(transactions.get(i)))
	        	map.put(transactions.get(i), map.get(transactions.get(i))+1);
	        else map.put(transactions.get(i),1);
	    }
	    for(Map.Entry<String,Integer> entry: map.entrySet() ){
	        outPutlist.add(entry.getKey()+ " "+entry.getValue());
	    }
	    Collections.sort(outPutlist);
	    
	    System.out.println(transactions);
	    return transactions;

	    }
	public static void main(String[] args) throws IOException {
        

        List<String> transactions = new ArrayList<>();
        transactions.add("bin");
        transactions.add("can");
        transactions.add("bin");
        groupTransactions(transactions);

        
    }
}
