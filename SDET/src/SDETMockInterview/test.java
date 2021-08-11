package SDETMockInterview;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=null;
		if (car1==null){
			car1=new Car();
		}
		
		Car car2=car1;
		car1=null;
		System.out.println(car2);

	}

}
