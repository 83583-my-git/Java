import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		String str4 = "ganesh shitole from chikhli buldhana";
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string to reverse");
		str = sc.nextLine();
		int count = 0;
		String [] arr = str.split(" ");
		for (String element : arr)
		{
			System.out.println(element);
			count++;
		}
		System.out.println("number words in your string are = "+count);
		System.out.println("no of char before trim = "+str.length());
		String str2 = str.trim();
		System.out.println("no of char after trim = "+str2.length());
	}
}
