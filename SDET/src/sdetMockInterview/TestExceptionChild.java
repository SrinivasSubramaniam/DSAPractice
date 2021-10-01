package sdetMockInterview;

import java.io.IOException;

public class TestExceptionChild extends Parent {
	 void msg()throws IOException{  
		    System.out.println("TestExceptionChild");  
		  }  
		  public static void main(String args[]){  
		   Parent p=new TestExceptionChild();  
		   try {
			p.msg();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		  }

}
