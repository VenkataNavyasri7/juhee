package com.hcl.day3;

class Data{
	public void sayHello(){
		System.out.println("we are from HCL..");
	}
	private void lunch(){
		System.out.println("No Lunch Today...");
	}
	void logoff(){
		System.out.println("Logout by 6.30");
	}
}
public class Demo {
public static void main(String[] args){
	Data obj=new Data();
	obj.sayHello();
	obj.logoff();
	}
}
