package _01Person;

public class Person {
	private String name;
	private Date bDate;
	public Person() {
		super();
	}
	public Person(String name, int dd, int mm , int yy) {
		super();
		this.name = name;
		this.bDate = new Date(dd,mm,yy);
	}
	public void display() {
		System.out.println("Name: "+name+" Bithdate: "+bDate);
	}
	public String toString() {
		return "Name: "+name+" Bithdate: "+bDate;
	}
}
