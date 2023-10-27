class _11Fruits{
	private String name;
	private boolean isSeeded;
	private char vitamin;
	_11Fruits(){}
	_11Fruits(String name , boolean isSeeded , char vitamin){
		this.name = name;
		this.isSeeded = isSeeded;
		this.vitamin = vitamin;
	}
	void display(){
		if(isSeeded){
			System.out.println("Seeded Fruit "+name+" Contains Vitamin "+vitamin);
		}else{
			System.out.println("Seedless Fruit "+name+" Contains Vitamin "+vitamin);
		}
		
	}
}