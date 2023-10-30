package _01Person;

public abstract class Employee extends Person {
	private int empId;
	protected double salary;
	public Employee() {
		super();
		empId = 0;
		salary = 0.0;
	}
	public Employee(String name, int dd, int mm , int yy , int empId , double salary) {
		super(name, dd, mm ,yy);
		this.empId = empId;
		this.salary = salary;
	}
	public void display() {
		super.display();
		System.out.println("Emp Id : "+empId+" Salary : "+salary);
	}
	public String toString() {		
		return super.toString()+"Emp Id : "+empId+" Salary : "+salary;
	}
	public abstract void calSalary();
	public double getSalary() {
		return salary;
	}

	public int getEmpId() {
		// TODO Auto-generated method stub
		return empId;
	}
}
