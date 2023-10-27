//WAPT display two digits prime number only

class TwoDigitPrimeNumber{
	public static void main(String[] args){
		int num = 11;
		int count = 0;
		while(num < 100){
			boolean flag = true;
			for(int i = 2 ; i < num/2 ; i++){
				if( num % i == 0){
					flag = false;
					break;
				}
			}
			
			if(flag){
				System.out.println(num);
				count++;
			}
			
			num++;			
		}
		System.out.println("******************************"+count+"****************************************");
		
	}
}