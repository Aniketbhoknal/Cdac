package _02Book;

public class EBook extends Book {

	public EBook() {
		super();
		
	}

	public EBook(int bookId, String title, double price) {
		super(bookId, title, price);
	}

	@Override
	void calculateCost() {
		double price = super.getPrice();
		if(price <= 500) {
			price -= (price*0.02);
		}else if(price > 500 && price <=1000) {
			price -= (price*0.05);
		}else if(price > 1000 && price <= 5000) {
			price -= (price*0.07);
		}
		System.out.println("Price of EBook is: "+price);
	}
	
	
}
