package com.sunbeam.exception;

public class ExceptionLineTooLong extends Exception{
	String massage;

	public ExceptionLineTooLong(String massage) {
		
		this.massage = massage;
	}

	public ExceptionLineTooLong() {
		this.massage = "The strings is too long";
	}
	@Override
	public void printStackTrace() {

		System.err.println("********Exception : *********");
		System.err.println("massage = "+massage);
	}
	
	
	

}
