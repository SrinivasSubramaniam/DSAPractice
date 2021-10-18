package newfeatures;

public interface Android {
	public void launch();
	default void quit(){
		System.out.println("Chroem is closed");
	}
	
}
