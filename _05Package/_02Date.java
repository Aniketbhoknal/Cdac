package office2.utility;

public class _02Date{
	int dd,mm,yy;
	public _02Date(){}
	public _02Date(int dd, int mm , int yy){
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public String toString(){
		return dd+"/"+mm+"/"+yy;
	}
	public void display(){
		System.out.println(dd+"/"+mm+"/"+yy);
	}
}