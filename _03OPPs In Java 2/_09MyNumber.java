class _09MyNumber{
	private int num;
	_09MyNumber(){
		num = 0;
	}
	_09MyNumber(int num){
		this.num = num;
	}
	void isEven(){
		if(num % 2 == 0){
			System.out.println("Number is Even");
		}else{
			System.out.println("Number is Not Even");
		}
	}
	void isOdd(){
		if(num % 2 != 0){
			System.out.println("Number is Odd");
		}else{
			System.out.println("Number is Not Odd");
		}
	}
	void isPositive(){
		if(num > 0){
			System.out.println("Number is Positive");
		}else{
			System.out.println("Number is Not Positive");
		}
	}
	void isNegative(){
		if(num < 0){
			System.out.println("Number is Negative");
		}else{
			System.out.println("Number is Not Negative");
		}
	}
	void isZero(){
		if(num == 0){
			System.out.println("Number is Zero");
		}else{
			System.out.println("Number is Not Zero");
		}
	}
}