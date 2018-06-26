
public class Car {
	
	private String color;
	private int model;
	private long chassiNumber;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public long getChassiNumber() {
		return chassiNumber;
	}

	public void setChassiNumber(long chassiNumber) {
		this.chassiNumber = chassiNumber;
	}

	public static Car getCar() {
		return car;
	}

	public static void setCar(Car car) {
		Car.car = car;
	}

	private static Car car = new Car();
	
	private Car() {
	}
	
	public static Car getInstance() {
		
		return car;
	}
}
