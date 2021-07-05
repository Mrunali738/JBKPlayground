package jdkFeature8;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	//comes from db
	//comes from API
	
	public List<Book> getBooks(){
	List<Book> ll = new ArrayList<Book>();
		ll.add(new Book(1, "Core Java", "KiranD"));
		ll.add(new Book(2, "Python", "AmitB"));	
		ll.add(new Book(3, "Selenium", "PavanK"));	
		ll.add(new Book(4, "Spring Boot", "DarshitR"));	
		return ll;
	
	}

}
