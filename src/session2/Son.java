package session2;

//IS-A relationship
public class Son extends Mother implements RoleModel, Smoker, Complainer {

	@Override
	public void beRespectful() {
		System.out.println("Be respectful to friends");
	}

	@Override
	public void smoke() {
		System.out.println("Smoking at a young age");
	}

	@Override
	public void complainAllTheTime() {
		System.out.println("Complaininig to everyone");
	}

}

class Daughter extends Mother implements RoleModel, Smoker, Complainer {

	@Override
	public void beRespectful() {
		System.out.println("Be respectful to everyone");
	}

	@Override
	public void smoke() {
		System.out.println("Smoking at a young age");
	}

	@Override
	public void complainAllTheTime() {
		System.out.println("Complaininig to everyone");
	}

}


abstract class Mother{
	String lastName;
	
}


interface RoleModel{
	void beRespectful();
}

interface Complainer{
	void complainAllTheTime();
}

interface Smoker{
	void smoke();
}

