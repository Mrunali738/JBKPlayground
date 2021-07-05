package jdkFeature8;

public class BookClient {

	public static void main(String[] args) {
		BookService bs = new BookService();
		System.out.println(bs.getBooksInSort());
		System.out.println(bs.getBooksInSort2());
		System.out.println(bs.getBooksInSort3());
	}

}
