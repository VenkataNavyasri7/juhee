package com.hcl.jdk8;





public class EmployException extends Exception{
	public EmployException() {
		
	}
	public EmployException(String error) {
		super(error);
	}
}