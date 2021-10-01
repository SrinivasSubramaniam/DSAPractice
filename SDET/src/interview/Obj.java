package interview;

class Parent {
	int length=10;
	public void getSize(){
		System.out.println("This is parent size");
	}
	public static void one(){
		System.out.println("i am static one");
	}

}
class Child extends Parent {
	
	int length=20;
	public void getSize(){
		//System.out.println(length);
		//System.out.println(super.length);
		//System.out.println(super.length);
		System.out.println("This is child size");
	}
	public void getMaxSize(){
		//System.out.println(super.length);
		System.out.println("This is child Max size");
	}
	public static void one(){
		System.out.println("i am static two");
	}

}

public class Obj{
	public static void main(String[] args) {
		Parent c=new Child();
		c.getSize();
		System.out.println(c.length);
		c.one();
		//System.out.println(c.length);
	}
}
