class _02Max{
	public static void main(String[] args){
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int max = (num1 > num2)?((num1 > num3)?num1:num3):((num2 > num3)?num2 : num3);
		System.out.println("Max Number is: "+max);
	}
}