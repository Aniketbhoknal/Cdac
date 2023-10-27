class _05Complex{
	private int real , img;
	_05Complex(){}
	_05Complex(int real , int img){
		this.real = real;
		this.img = img;
	}
	void display(){
		if(img < 0){
			System.out.println(real + "" + img + "i");
		}else{
			System.out.println(real + "+" + img + "i");
		}
	}
}