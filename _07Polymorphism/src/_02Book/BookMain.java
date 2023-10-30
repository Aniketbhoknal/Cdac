package _02Book;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book[] arr = new Book[5];
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("Enter the Type of book you want to add: ");
			System.out.println("1:EBook\t2:PaperBook");
			int choice = sc.nextInt();
			System.out.println("Enter Book ID:");
			int id = sc.nextInt();
			System.out.println("Enter Book Title");
			String title = sc.next();
			System.out.println("Enter Price: ");
			double price = sc.nextDouble();
			if(choice == 1) {
				arr[i] = new EBook(id,title,price);
			}else if(choice == 2) {
				arr[i] = new PaperBook(id,title,price);
 			}else {
 				System.out.println("Envalid input");
 				System.exit(0);
 			}
		}
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].calculateCost();
		}
	}

}
