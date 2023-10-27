class _15Pattern{
	public static void main(String[] args){
		int b = 0;
		for(int i = 0; i < 5 ; i++){
			for(int j = 7 - i - b; j >= 0 ; j--){
				System.out.print(" ");
			}
			int a = 1;
			for(int j = 0 ; j < i+1+b ; j++){
				//System.out.print(" *");
				if(j < ((i+1+b)/2)){
					System.out.print(" "+a);
					a++;	
				}else{
					System.out.print(" "+a);
					a--;
				}
			}
			b += 1;
			System.out.println();
		}
	}
}