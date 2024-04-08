package com.app.fruits;

import java.util.Scanner;

public class FruitBascket {
	private String colour;
	private double weight;
	private String name;
	private boolean isFresh = true;
	public FruitBascket(String colour, double weight, String name, boolean isFresh) {
		super();
		this.colour = colour;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	public FruitBascket()
	{
		
	}
	public void accept()
	{
		boolean freshFruit;
		System.out.println("enter a fruit colour - ");
		Scanner sc = new Scanner(System.in);
		colour = sc.next();
		System.out.println("enter a fruit weight  - ");
		weight = sc.nextDouble();
		System.out.println("enter a fruit name - ");
		name = sc.next();
		
		
	}
	public void display()
	{
		System.out.println("fruit colour = "+colour );
		System.out.println("fruit weight = "+weight );
		System.out.println("fruit name = "+name );
	}

	@Override
	public String toString() {
		return "FruitBascket [colour=" + colour + ", weight=" + weight + ", name=" + name + "]";
	}
	public String test()
	{
		return "no specific taste";
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	
	

}

