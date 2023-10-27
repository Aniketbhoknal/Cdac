class _12Armstrong{
	public static void main(String[] args){
		int num = 1634;
		int digits = 0;
		int temp = num;
		int sum = 0;
		while(num > 0){
			num /= 10;
			digits++;
		}
		num = temp;
		while(num > 0){
			int mod = num % 10;
			int mul = 1;
			for(int i = 0 ; i < digits ; i++){
				mul *= mod;
			}
			sum += mul;
			num /=10;
		}

		if(temp == sum){
			System.out.println("Number is Armstrong Number: ");
		}else{
			System.out.println("Number is Not Armstrong Number: ");
		}
	
	}
}