package newfeatures;

public class Mobile implements Android,Oneplus,Samsung{
	public static void main(String[] args) {
		Samsung.log();
		Oneplus.log();
		new Mobile().quit();
	}

	@Override
	public void quit() {
		Oneplus.super.quit();
	}

	@Override
	public void launch() {
		// TODO Auto-generated method stub
		
	}

	
}
