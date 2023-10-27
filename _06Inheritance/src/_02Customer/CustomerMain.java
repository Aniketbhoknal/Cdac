package _02Customer;

import java.util.Scanner;

public class CustomerMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter type of Customer: ");
		System.out.println("1:Normal Customer\t2:Regular Customer");
		int choice = sc.nextInt();
		if(choice == 1) {
			Customer c1 = new Customer("Shubham",9,4,2000,"shubhamkale1857","Georai");
			System.out.println("Enter Amount");
			double am = sc.nextDouble();
			System.out.println(c1);
			System.out.println("Total Amount for Customer: "+c1.giveDiscount(am));
		}else if(choice == 2) {
			Customer c = new RegularCustomer("Saurabh",22,5,2003,"saurabhkale1857","Georai",101);
			System.out.println("Enter Amount");
			double am = sc.nextDouble();
			System.out.println(c);
			System.out.println("Total Amount for Regular Customer: "+c.giveDiscount(am));
		}
		sc.close();
	}
}
