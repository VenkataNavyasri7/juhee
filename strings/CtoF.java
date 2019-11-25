package com.hcl.day3;

public class CtoF {
public void calc(double c){
	double f=((9*c)/5)+32;
	System.out.println("Farhenheit value "+f);
	}

public static void main(String[] args) {
	CtoF obj=new CtoF();
	obj.calc(37);
}
	

}
