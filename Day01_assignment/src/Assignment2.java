//2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
//doubles, supply suitable error message & terminate.
//If numbers are double values, print its average.
//Hint : Check Scanner class for the methods

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		double num1;
		double num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a numbers : ");
		
		if (sc.hasNextDouble()) {

			num1 = sc.nextDouble();
			if (sc.hasNextDouble()) {
				num2 = sc.nextDouble();

				double avg;
				avg = (num1 + num2) / 2;
				System.out.println("avarage = " + avg);
			} else {
				System.out.println("value entered was not double .....");
			}

		}

		else {
			System.out.println("value entered was not double .....");
		}

	}

}
