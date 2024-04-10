package com.sunbeam.entity;
import java.util.Scanner;

import com.sunbeam.exception.ExceptionLineTooLong;
public class Entity{
	String string;

	public Entity()
	{
		
	}
	public Entity(String string)
	{
		this.string = string;
	}
	
	public void accept(Scanner sc) throws ExceptionLineTooLong
	{
		System.out.println("enter line ");
		string = sc.next();
		if(string.length()>80)
			throw new ExceptionLineTooLong();
	
		System.out.println("program executed successfully");
		
	}
	@Override
	public String toString() {
		return string;
	}
			
	

}
