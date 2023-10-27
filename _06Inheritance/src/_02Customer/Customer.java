package _02Customer;

import _01Person.Person;

public class Customer extends Person {
	private String email;
	private String address;
	public Customer() {
		super();
		email = "";
		address = "";
	}
	public Customer(String name, int dd, int mm, int yy,String email, String address) {
		super(name, dd, mm, yy);
		this.email = email;
		this.address = address;
	}
	public double giveDiscount(double amount) {
		return amount;
	}
	public String toString() {
		return super.toString()+"Email: "+email+" Address: "+address;
	}
}
