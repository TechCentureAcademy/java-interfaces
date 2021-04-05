package session2;

public class Runner {

	
	public static void main(String[] args) {
		
		
//		RoleModel roleModel = new Son();
//		roleModel.beRespectful();
//		
//	
//		roleModel = new Daughter();
//		roleModel.beRespectful();
//		
		
		
		Vehicle vehicle = new Car();
		vehicle.run();
		
		vehicle = new Bus();
		vehicle.run();
		
		vehicle = new Truck();
		vehicle.run();
		
	// Place does not implement Vehicle, so it does not compile	
	//	vehicle = new Plane();
	//	vehicle.run();
	}
}
