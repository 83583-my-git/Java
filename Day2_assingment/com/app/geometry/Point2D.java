//Q2. Create a class Point2D , in package - "com.app.geometry" : for representing a point in x-y co-
//ordinate system. Create a parameterized constructor to init x & y co-ords. Add a method to return
//string form of point's x & y co-ords
//Hint : public String getDetails())
//Add isEqual method to Point2D class :a boolean returning method : must return true if n only if
//both points are having same x,y co-ords or false otherwise.
//Add calculateDistance method to calculate distance between current point and specified point &
//return the distance to the caller.
//Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
//Write TestPoint class , in package "tester" , with a main method, Accept co ordinates of 2 points
//from user (Scanner) --to create 2 points (p1 & p2)
//Use getDetails method to display point details.(p1's details & p2's details)
//Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same
//position)
//If they are not located at the same position , display distance between p1 & p2
package com.app.geometry;

public class Point2D {
	int x;
	int y;
	String details;
	
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public String details()
	{
		details = x+","+y;
		return details;
	}
	

	public boolean isEqual(int x,int y)
	{
		if (this.x == x && this.y == y)
		
			return true;
		else 
			return false;
	}
	public void distance(int x, int y)
	{	
		double b = Math.pow((x-this.x),2);
		double l= Math.pow((y-this.y),2);
		double d = Math.sqrt(b+l);
		System.out.println("distance between two point is equal to =  "+d);
	}
	



}
