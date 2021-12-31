package onspot;

import java.util.ArrayList;

public class WaysToPrint {
	static void printlist(ArrayList<Integer> arr)
	{
	    if (arr.size() != 1)
	    {
	        for(int i = 0; i < arr.size(); i++)
	        {
	            System.out.print(arr.get(i) + " ");
	        }
	        System.out.println();
	    }
	}
	 
	static void findWays(ArrayList<Integer> list,
	                     int i, int n)
	{
	     
	    if (n == 0) printlist(list);
	 
	    for(int j = i; j <= n; j++)
	    {
	        list.add(j);
	        findWays(list, j, n - j);
	        //1 1 1 1
	        //1 1 1 
	        list.remove(list.size() - 1);
	    }
	}
	public static void main(String[] args)
	{
	    int n = 4;
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    findWays(list, 1, n);
	}

}
