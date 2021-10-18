package newfeatures;

public interface Oneplus extends Android {

	static void log(){
		System.out.println("oneplus log is created");
	}
	default void quit(){
		System.out.println("Oneplus is closed");
	}
	

}
