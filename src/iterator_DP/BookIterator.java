package iterator_DP;

import java.util.List;
import java.util.NoSuchElementException;

public class BookIterator{

	int currentIndex=0;
	List<Book> list;
	public BookIterator(List<Book> list) {
		this.list=list;
	}
	
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return currentIndex < list.size();
	}

	
	public Book next() {
		if(!hasNext()) {
			throw new NoSuchElementException();
		}
		return list.get(currentIndex++);
	}

}
