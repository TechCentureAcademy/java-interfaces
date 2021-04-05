package session1;

public abstract class Mother {

	
	
	public abstract void sayHello();
	public void sayGoodBye() {
		
	}
}

class Child extends Mother implements RoleModel, Teacher, Ironman, President{

	@Override
	public void leadPeople() {
		System.out.println("Child is leading his friends");
	}

	@Override
	public void protectFriends() {
		System.out.println("Child is protecting friends from bullies");
	}

	@Override
	public void beDiscipled() {
		System.out.println("Child is being very discipled");
	}

	@Override
	public void respectOthers() {
		System.out.println("Child respects everyone around");
	}

	@Override
	public void sayHello() {
		System.out.println("Hi there!");
	}
	
	public void sayGoodBye() {
		
	}
	
}


interface RoleModel{
	void respectOthers();
}
interface Teacher{
	void beDiscipled();
}
interface Ironman{
	void protectFriends();
}
interface President{
	void leadPeople();
}

class Student implements RoleModel{

	@Override
	public void respectOthers() {
		System.out.println("Student respecting others");
	}
	
}





