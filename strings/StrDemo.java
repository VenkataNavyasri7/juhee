package com.hcl.day3;

public class StrDemo {
	public void show(){
		String msg="welcome to java Programming...From  HCL";
		System.out.println("Length" +msg.length());
		System.out.println("First OCcurence of 'a' is" +msg.indexOf('a'));
		System.out.println("Last OCcurence of 'a' is" +msg.indexOf('a'));
		System.out.println("First OCcurence of 'z' is" +msg.indexOf('z'));
		System.out.println("char at 5th Position is" +msg.charAt(5));
		System.out.println("Lower case" +msg.toLowerCase());
		System.out.println("Upper case" +msg.toUpperCase());
		System.out.println("Substring "+msg.substring(1,10));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
