package _01Person;

public class SalesPerson extends Employee {
	private double incentive;
	private int target;
	public SalesPerson() {
		super();
		// TODO Auto-generated constructor stub
		incentive = 0.0;
		target = 0;
	}
	public SalesPerson(String name, int dd, int mm, int yy, int empId, double salary , double incentive , int target) {
		super(name, dd, mm, yy, empId, salary);
		this.incentive = incentive;
		this.target = target;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Incentive: "+incentive+"Target: "+target;
	}
	public void calSalary() {
		System.out.println("Salary of Emp having EMP ID: "+super.getEmpId()+" is "+(salary+(incentive*target)));
	}	
	
}
