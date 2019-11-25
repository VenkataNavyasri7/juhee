	package com.hcl.day3;

public class SbExample {
	public StringBuilder show(String firstname,String lastname,String city,double cgp){
		StringBuilder sb=new StringBuilder();
		if(firstname.length()<5){
			sb.append("Invalid Firstname...");
		}
		if(lastname.length()<5){
			sb.append("\n invalid city..");
		}
		if(cgp > 10){
			sb.append("\n Invalid CGP");
		}
		return sb;
	}
	public static void main(String[] args ){
		String firstname="Ram",lastname="Kisan",city="goa";
		double cgpa=12.5;
		System.out.println(new SbExample().show(firstname,lastname,city,cgpa));
		
	}

}
