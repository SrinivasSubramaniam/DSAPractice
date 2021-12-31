package interview.practice.latest;

public abstract class Bike {
	Bike(){
		System.out.println("bike is created");
		
	}
	abstract void run();
	void changeGear(){
		System.out.println("gear is changed");
	}
	
}
