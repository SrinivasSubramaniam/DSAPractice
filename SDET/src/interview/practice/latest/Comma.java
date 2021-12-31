package interview.practice.latest;

public class Comma {
	
	
	int a=0;int b=9;
	public int sum(){
		return a+b;
	}
	private int add(){
		return a+b;
	}
	int result(){
		return new Comma().add();
	}
	
	
	public static void main(String args[])
    {
        Comma c=new Comma();
        System.out.println(c.sum()+c.result());
    }

}
