package session1;

public interface Communicate {

	void shareIdea();
}

interface Speak extends Communicate{
	void speak();
}
interface TalkLoudly extends Speak{
	void shout();
}


class Speech implements TalkLoudly{
	
	public void shout() {
		
	}
	public void speak() {
		
	}
	public void shareIdea() {
		
	}
}













