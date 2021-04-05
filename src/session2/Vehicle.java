package session2;

public interface Vehicle {

	void run();
	
}


class Car implements Vehicle{

	@Override
	public void run() {
		System.out.println("This car runs very fast");
	}
	
}

class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("Bus can run slowly");
	}
	
}

class Truck implements Vehicle{

	@Override
	public void run() {
		System.out.println("Truck can run fast on a highway");
	}
	
}

class Plane {
	public void run() {
		System.out.println("Plane can run slower");
	}
}


