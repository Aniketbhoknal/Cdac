package _01Person;

public class DemoMain {

	public static void main(String[] args) {
		Person p = new Person("Shubham",9,4,2000);
		//dynamic binding reference and object of same type so calling display method of person
		p.display();
		Employee e = new Employee("Saurabh",22,5,2003,201,100000);
		e.display();
		Person p1 = new Employee("Suraj",14,3,2000,310,200000);
		p1.display();
	}
}
