package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	public static void main(String[] args) {
		int size;
		System.out.println("enter size of fruit basket ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		FruitBascket[] bascket = new FruitBascket[size];
		int choice;
		int index = 0;
		
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of all fruits in the basket.");
			System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket.");
			System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Mark all sour fruits stale");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 :
				if(index<size)
				{
					bascket[index] = new Mango(); //upcasting
					bascket[index].accept();
					index++;
				}
				break;
			case 2 :
				if(index<size)
				{
					bascket[index] = new Orange();
					bascket[index].accept();
					index++;
				}
				break;
			case 3 :
				if(index<size)
				{
					bascket[index] = new Apple();
					bascket[index].accept();
					index++;
				}
				break;
				
			case 4 :
				for(FruitBascket fb:bascket)
					if(fb!=null){
						System.out.println("name of fruit = " +fb.getName() );
						
					}
				
				break;
			case 5 :
				for(FruitBascket fb:bascket)
					if(fb!=null){
						System.out.println("colour of fruit = " +fb.getColour() );
						System.out.println("weight of fruit = " +fb.getWeight() );
						System.out.println("taste of fruit = " +fb.test() );
					}
				break;
				
			case 6 :
				for(FruitBascket fb : bascket)
				{
					if(fb.isFresh()==false)
					{
						System.out.println("taste"+fb.test());
					}
				}
				break;
				
			case 7 :
				System.out.println("enter a index for fruit is not fresh ");
				int i;
				i = sc.nextInt();
				
				if(i<index)
					bascket[i].setFresh(false);
				else
				{
					System.out.println(" *******wrong item number entered********** ");
				}
				break;
				
			case 8 :
				for(FruitBascket fb: bascket)
				{
					if(fb.test()=="sour" || fb.test()=="sweet and sour")
					{
						System.out.println(fb.getName());
					}
				}
				break;
			}
			
		}while(choice!=0);
	}

}
