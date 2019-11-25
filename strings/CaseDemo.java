package com.hcl.day3;

public class CaseDemo {
	public void Show(String dayName){
		switch(dayName){
		case "mon":
			System.out.println("it is Monday");
			break;
		case "Tue":
			System.out.println("it is Tuesday");
			break;
		case "wed":
			System.out.println("it is wedesday");
			break;
		case "thurs":
			System.out.println("it is thursday");
			break;
		case "fri":
			System.out.println("it is friday");
			break;
		case "sat":
			System.out.println("it is saturday");
			break;
		case "default":
			System.out.println("it is Sunday");
			}
	}
	public static void main(String[] args) {
		new CaseDemo().Show("mon");
	}

}
