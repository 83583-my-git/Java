import java.util.Scanner;

public class Pealindrome {
	public static void main(String[] args) {
		String str = "";
		String str2 = "gannag";
		String str3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string check palindrome or not ");
		str = sc.next();
		for(int i = (str2.length()-1);i>=0;i--)
		{
			str = str +str2.charAt(i);
		}
		if (str.equals(str2))
		{
			System.out.println("string are palindrome");
		}
		else 
		{
			System.out.println(" string are not palindrome");
		}
		
	}
}
