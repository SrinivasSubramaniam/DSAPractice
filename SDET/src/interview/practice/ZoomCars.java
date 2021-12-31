package interview.practice;

public class ZoomCars {
	
	// Lombok --> getter and setter !!
	
	private String car;
	private String type;
	private int price;
	
	public ZoomCars(String car, String type, int price) {
		this.car = car;
		this.type = type;
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return car +" "+price;
	}



	public String getCar() {
		return car;
	}
	
	public void setCar(String car) {
		this.car = car;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
