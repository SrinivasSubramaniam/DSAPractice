package interview;

public class ClassB extends ClassA {
	int length=20;
	public ClassB(){
		//System.out.println(super.length);
		//System.out.println(super.length);
		System.out.println("This is subclass constructor");
	}
	public void getMethod(){
		
		System.out.println("this is child get method");
	}
public void newMethod(){
		
		System.out.println("this is child get method");
	}
	public static void main(String[] args) {
		ClassA a=new ClassB();
		System.out.println(a.length);
		a.getMethod();
	}
}
