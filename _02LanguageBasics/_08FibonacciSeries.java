class _08FibonacciSeries{
	public static void main(String[] args){
		int num1 = 0;
		int num2 = 1;
		int num3 = 1;
		int size = 10;
		System.out.print(num1 + " " + num2 + " " + num3 + " ");
		for(int i = 3 ; i < size ; i++){
			int fib = num2 + num3;
			System.out.print(fib + " ");
			num2 = num3;
			num3 = fib;
		}
	}
}