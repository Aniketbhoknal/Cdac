class _09SumOfDigits{
	public static void main(String[] args){
		int num = 2536;
		int sum = 0;
		while(num >= 9){
			sum = 0;
			while(num > 0){
				sum += num%10;
				num/=10;
			}
			num = sum;
		}
		System.out.println(sum);
	}
}