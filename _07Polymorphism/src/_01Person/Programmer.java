package _01Person;

public class Programmer extends Employee {
	private int extraHours;
	private int chargesPerHr;
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Programmer(String name, int dd, int mm, int yy, int empId, double salary,int ex, int ch) {
		super(name, dd, mm, yy, empId, salary);
		extraHours = ex;
		chargesPerHr = ch;
	}
	public String toString() {
		return super.toString()+"Extra: "+extraHours+"Charges: "+chargesPerHr;
	}
	public void calSalary() {
		int id  = super.getEmpId();
		System.out.println("Salary of Emp having EMP ID: "+id+" is "+(salary+(extraHours*chargesPerHr)));
	}	
	
}
