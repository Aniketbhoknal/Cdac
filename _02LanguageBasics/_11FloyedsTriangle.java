import java.util.*;

class _11FloyedsTriangle{
	public static void main(String[] main){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int num = sc.nextInt();
		int a = 1;
		for(int i = 0 ; i < num ; i++){
			for(int j = 0 ; j < i+1 ; j++){
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}
}