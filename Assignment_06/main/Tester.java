package com.sunbeam.main;

import java.util.Scanner;

import com.sunbeam.entity.Entity;
import com.sunbeam.exception.ExceptionLineTooLong;

public class Tester {

	public static void main(String[] args) {
		Entity entity = new Entity();
		Scanner sc = new Scanner(System.in);
		try {
		entity.accept(sc);
		}catch (ExceptionLineTooLong e ) {
			e.printStackTrace();
		}

	}
}
