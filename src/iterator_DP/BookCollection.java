package iterator_DP;

import java.util.List;

public class BookCollection{
	List<Book> list;
	
	
	public BookCollection(List<Book> list) {
		this.list = list;
	}


	public BookIterator createIterator() {
		
		return new BookIterator(list);
	}
	public void addBook(Book b) {
		list.add(b);
	}

}
