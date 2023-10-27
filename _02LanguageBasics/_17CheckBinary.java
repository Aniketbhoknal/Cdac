class _17CheckBinary{
	public static void main(String[] args){
		int num = 10010011;
		boolean flag = true;
		while(num > 0){
			if(num % 10 == 0 || num % 10 == 1){
				num /=10;
				continue;
			}else{
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("Number is Binary Number");
		}else{
			System.out.println("Number is Not Binary Number");
		}
	}
	
}