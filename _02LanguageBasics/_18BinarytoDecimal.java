import java.lang.Math;
class _18BinarytoDecimal{
	public static void main(String[] args){
		int num = 101010;
		int temp = num;
		int a = 0;
		int sum = 0;
		while(num > 0){
			if(num % 10 == 1){
				sum += Math.pow(2,a);
			}
			num /= 10;
			a++;
		}
		System.out.println("Decimal Value of "+temp+" is "+sum);
	}
}