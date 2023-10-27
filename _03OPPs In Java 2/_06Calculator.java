class _06Calculator{
	private int num1, num2;
	_06Calculator(){}
	_06Calculator(int num1 ,int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	void addition(){
		System.out.println("Addition: "+(num1+num2));
	}
	void multiplication(){
		System.out.println("Multiplication: "+(num1*num2));
	}
	void substraction(){
		System.out.println("Substraction: "+(num1-num2));
	}
	void division(){
		System.out.println("Division: "+(num1/num2));
	}
}