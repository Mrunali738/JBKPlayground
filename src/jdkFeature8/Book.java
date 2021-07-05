package jdkFeature8;

public class Book {
	//public static void main(String[] args) {
	private Integer id;
	private String bookname;
	private String auther;
	
	public Book() {
		
	}
	public Book(Integer id, String bookname, String auther) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.auther = auther;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	@Override
	public String toString() {
		return "Book [id= " + id + ", bookname= " + bookname + ", auther= " + auther + "]";
	}
}
	


