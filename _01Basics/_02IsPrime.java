class _02IsPrime
{
	public static void main(String[] args){
		int num = 23;
		boolean flag = true;
		for(int i = 2; i < num/2 ; i++){
			if(num % i == 0){
				flag = false;
			}
		}
		if(flag){
			System.out.println(num + " is Prime Number");
		}else{
			System.out.println(num + " is Not Prime Number");
		}
	}
}