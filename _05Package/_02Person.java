package office2.staff;
import office2.utility._02Date;
public class _02Person{
	String name;
	_02Date bDate;
	public _02Person(){}
	public _02Person(String name , int dd, int mm , int yy){
		this.name = name;
		bDate = new _02Date(dd,mm,yy);
	}
	public String toString(){
		return "Name: "+name+"BirthDate: "+bDate;
	}
	public void display(){
		System.out.println("Name: "+name+"BirthDate: ");
		bDate.display();
	}
}