class _01Date{
	private int dd , mm , yy;
	//Non parametrized Constructor
	_01Date(){
	}
	//Full parametrized Constructor
	_01Date(int dd , int mm , int yy){
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	//parametrized Constructor
	_01Date(_01Date d){
		dd = d.dd;
		mm = d.mm;
		yy = d.yy;
	}
	public void display(){
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	public void display(char ch){
		System.out.println(dd+""+ch+""+mm+""+ch+""+yy);
	}
}