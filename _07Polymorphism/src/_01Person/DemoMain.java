package _01Person;

public class DemoMain {

	public static void main(String[] args) {
//		Person p = new Person("Shubham",9,4,2000);
//		//dynamic binding reference and object of same type so calling display method of person
//		p.display();
//		Employee e = new Employee("Saurabh",22,5,2003,201,100000);
//		e.display();
//		Person p1 = new Employee("Suraj",14,3,2000,310,200000);
//		p1.display();
		Employee[] arr = new Employee[3];
		arr[0] = new SalesPerson("Shubham1", 9, 4, 2000, 201, 10000, 4, 5);
		arr[1] = new Programmer("Shubham2", 9, 4, 2000, 202, 10000, 10, 7);
		arr[2] = new Admin("Shubham3", 9, 4, 2000, 203, 10000, 1100);
		for(int i = 0 ; i < 3 ; i++) {
			arr[i].calSalary();
		}
	}
}
