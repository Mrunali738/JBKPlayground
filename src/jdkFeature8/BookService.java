package jdkFeature8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	
	//Business Logic
	//First Approach Traditional
	public List<Book> getBooksInSort(){
		List<Book> ll = new BookDAO().getBooks();
		Collections.sort(ll, new MyComparator());
		return ll;	
	}
	
	//Second Approach Traditional
	public List<Book> getBooksInSort2(){
		List<Book> ll = new BookDAO().getBooks();
		Collections.sort(ll, new Comparator<Book>(){
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getBookname().compareTo(o2.getBookname());
			}
		});
		return ll;	
	}
	
	//Third Approach By using Lambda () -> {}
	public List<Book> getBooksInSort3(){
		List<Book> ll = new BookDAO().getBooks();
		Collections.sort(ll, (o1, o2) -> o1.getBookname().compareTo(o2.getBookname()));
		return ll;
	}
	
	
	
}
