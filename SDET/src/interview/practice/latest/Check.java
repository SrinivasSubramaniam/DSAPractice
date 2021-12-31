package interview.practice.latest;

public class Check {
	
	public static void Method1(String a){
		System.out.println("String a");
	}
	public static void Method1(Object a){
		System.out.println("object a");
	}
	public static void main(String[] args){
		Method1("ABC");
		Method1(null);
	}

}
