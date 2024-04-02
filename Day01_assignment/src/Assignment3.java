//3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
//2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
//When user enters 'Generate Bill' option , display total bill & exit.
//(No need of any class, and no need to display the food deatils. Only display the total of orderd
//food)

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		int choice; 
		int amt = 0;
		int totalOrders = 0;
		do {
			System.out.println("enter your food choice");
			System.out.println(" 0. genrate bill");
			System.out.println(" 1. Dosa Rs-10/- ");
			System.out.println(" 2. Samosa Rs-20/- ");
			System.out.println(" 3. Idli Rs-30/-");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch(choice)
			{
			case 0:
				System.out.println("thank you ........");
				break;
				
			case 1:
				System.out.println("your dosa is in process plz PAY first ");
				amt = amt + 10;
				totalOrders++;
				break;
			case 2:
				System.out.println("your samosa is in process plz PAY first ");
				amt = amt + 20;
				totalOrders++;
				break;
			case 3:
				System.out.println("your idli is in process plz PAY first ");
				amt = amt + 30;
				totalOrders++;
				break;
			default :
				System.out.println("wrong choice this item is not available");
			}
			
			
			
		}while(choice !=0);
		System.out.println("total orders number - "+totalOrders);
		System.out.println("total amount - "+amt);
		
	}
}
