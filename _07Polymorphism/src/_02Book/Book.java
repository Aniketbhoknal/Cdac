package _02Book;

public class Book {
	private int bookId;
	private String title;
	private double price;
	public Book() {
		bookId = 0; 
		title = "";
		price = 0.0;
	}
	public Book(int bookId, String title, double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
	}
	void calculateCost() {
		System.out.println("Base class method");
	}
	public double getPrice() {
		return price;
	}
	
}
