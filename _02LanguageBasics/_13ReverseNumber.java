class _13ReverseNumber{
	public static void main(String[] main){
		int num = 123;
		while(num > 0){
			System.out.print(num%10);
			num/=10;
		}
	}
}