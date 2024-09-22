package iterator_DP;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Book> list=new ArrayList<>();
		
		BookCollection b=new BookCollection(list);
		b.addBook(new Book("The Story","Sneha"));
		b.addBook(new Book("Army", "Pradeep"));
		b.addBook(new Book("The Ramayan","Divya"));
		b.addBook(new Book("The Mahabharath","Shrilakshmi"));
		
		BookIterator it=b.createIterator();
		
		while(it.hasNext()) {
			Book b1=it.next();
			System.out.println("Title of the book is: "+b1.getTitle());
			System.out.println("Author of the book is: "+b1.getauthor());
			System.out.println();
		}

	}

}


//Implement a library system where you have a collection of books.
//You need to provide a way to iterate over the collection of books
//without exposing the underlying implementation of the collection. 
//Use the Iterator design pattern to solve this problem.
//1. Book: A simple class representing a book with a title and an author.
//2. BookCollection: A collection of books.
//3. BookIterator: An iterator for the BookCollection.
//4. Main: A class to demonstrate the usage of the iterator.