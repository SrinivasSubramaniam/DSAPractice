package SDETMockInterview;

import java.io.IOException;

public class TestExceptionChild1 extends Parent {
	void msg()throws ArithmeticException{  
	    System.out.println("child");  
	  }  
	  public static void main(String args[]) throws IOException{  
	   Parent p=new TestExceptionChild1();  
	   p.msg();
	  }  


}
