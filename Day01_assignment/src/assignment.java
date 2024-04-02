//Q1. Accept a integer number and when the program is executed print the binary, octal and
//hexadecimal equivalent of the given number.
//Sample Output:
//java Test
//Enter Number : 20
//Given Number :20
//Binary equivalent :10100
//Octal equivalent :24
//Hexadecimal equivalent :14
//Hint : Use Wrapper Class (toBinaryString() , toOctalString(), toHexString())
import java.util.Scanner;

public class assignment {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number - ");
		num1 = sc.nextInt();
		System.out.println("Given number  :"+num1);
		
		Integer i = new Integer(num1);
		System.out.println("Binary equivalent : "+i.toBinaryString(num1));
		System.out.println("Octal equivalent : "+i.toOctalString(num1));	
		System.out.println("Hexadecimal equivalent : "+i.toHexString(num1));
	
				
	}

}