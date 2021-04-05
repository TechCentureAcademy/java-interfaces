package session1;

public class Car extends Vehicle implements IMoveable{

	public double price;
	public long miles;
	
	public Car(String make, String model, String vin,
			double price, long miles) {
		super(make, model, vin);
		this.price = price;
		this.miles = miles;
	}

	@Override
	public void start() {
		System.out.println("Car is starting");
	}

	@Override
	public void stop() {
		System.out.println("Car has stopped");
	}

	@Override
	public void accelerate() {
		System.out.println("Car is accelerating");
	}

	@Override
	public void slowDown() {
		System.out.println("Car is slowing down");
	}

	
	
	
	
	
	
	
	
	
	
	
	

//	public static void main(String[] args) {
//		
//		
//		Car car = new Car("Honda", "Civic", "DFJDK5", 
//				10000, 565646);
//		
//		
//	}
}
