package interview;

public class TestMe {
	
	public static void main(String[] args) {
		SuperParent p=new SubChild();
		System.out.println(p.i);
		p.getMethod();
	}
}

class SuperParent{
	int i=10;
	public void getMethod(){
		System.out.println(i);
	}
}
class SubChild extends SuperParent{
	int i=20;
	public void getMethod(){
		System.out.println(i);
	}
}
