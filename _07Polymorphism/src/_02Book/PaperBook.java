package _02Book;

public class PaperBook extends Book {

	public PaperBook() {
		super();
		
	}

	public PaperBook(int bookId, String title, double price) {
		super(bookId, title, price);
		
	}

	@Override
	void calculateCost() {
		double price = super.getPrice();
		if(price <= 500) {
			price += (price*0.07);
		}else if(price > 500 && price <=1000) {
			price += (price*0.05);
		}else if(price > 1000 && price <= 5000) {
			price += (price*0.02);
		}
		System.out.println("Price of PaperBook is: "+price);
	}
	
	
}
