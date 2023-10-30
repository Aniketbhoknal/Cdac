package _01Person;

public class Admin extends Employee {
	private int bonus;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, int dd, int mm, int yy, int empId, double salary,int b) {
		super(name, dd, mm, yy, empId, salary);
		// TODO Auto-generated constructor stub
		bonus = b;
	}
	public String toString() {
		return super.toString()+"Bonus: "+bonus;
	}
	public void calSalary() {
		System.out.println("Salary of Emp having EMPID: "+super.getEmpId()+" is "+(salary+bonus));
	}	
}
