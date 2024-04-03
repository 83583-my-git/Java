package PointTesting;
import com.app.geometry.*;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int x1,y1,x2,y2;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter x1 = ");
		x1 = sc.nextInt();
		System.out.print("enter x2 = ");
		x2 = sc.nextInt();
		System.out.print("enter y1 = ");
		y1 = sc.nextInt();
		System.out.print("enter y2 = ");
		y2 = sc.nextInt();
		
		Point2D p1 = new Point2D(x1,y1);
		System.out.println("point details = "+p1.details());
		
		Point2D p2 = new Point2D(x2,y2);
		System.out.println("point details = "+p2.details());
		
		if(p1.isEqual(x2, y2)== true)
		{
			System.out.println("coordinate you provides are pointing to a same point");
		}
		else
		{
			p1.distance(x2, y2);
		}
		
		
	}

}
