import java.util.*;

class _11FruitsMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fruit Name: ");
		String name = sc.next();
		System.out.println("Enter Weather the Fruit is Seeded or not 1:Yes 2:No");
		int g = sc.nextInt();
		boolean isSeeded = false;
		if(g == 1){
			isSeeded = true;
		}
		System.out.println("Enter the vitamin it Contains: ");
		char v = sc.next().charAt(0);
		_11Fruits f1 = new _11Fruits(name,isSeeded,v);
		f1.display();
	}
}