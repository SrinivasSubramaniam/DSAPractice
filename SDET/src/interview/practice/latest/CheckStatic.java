package interview.practice.latest;

import java.util.ArrayList;
import java.util.List;

public class CheckStatic {
	static int x=5;
	public static int getStatic(CheckStatic c){
		return c.x;
	}
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		CheckStatic c=new CheckStatic();
		System.out.println(getStatic(c));
	}

}
