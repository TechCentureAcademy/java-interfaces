package session1;

public abstract class A {

	public abstract void show();
}

abstract class B extends A{
	
	//public abstract void show();
	public void say() {
		System.out.println("say somehting");
	}
}


class C extends B{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	public void say() {
		System.out.println("say something else");
	}
}


interface G{
	void show(); //public abstract void show();
	int calculateAge();
	String getName();
	double calcPrice();
	long getMiles();
}


interface ILaptop{
	void runApp();
}

class LaptopImpl implements ILaptop{

	@Override
	public void runApp() {
		// TODO Auto-generated method stub
		
	}
	
}








