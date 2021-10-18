package newfeatures;

public interface Samsung extends Android {

	static void log(){
		System.out.println("Samsung log is created");
	}
	default void quit(){
		System.out.println("Samsung is closed");
	}

}
