package session1;

public interface Readable {

	 void next();
	
}

interface PaperReadeable extends Readable{
	
	// void next();
	void goToNextPage();
}

class Book implements PaperReadeable {

	@Override
	public void next() {
		
	}

	@Override
	public void goToNextPage() {
		
	}
	
}

class Blog{
	
}

class OnlineArticle{
	
}