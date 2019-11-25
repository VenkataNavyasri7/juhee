package com.hcl.day5;

public class StDemo {
	
 void show(){
	 System.out.println("Show Method ..");
 }
 static void display(){
	 System.out.println("form display method...");
 }
 public static void main(String [] args){
	 new StDemo().show();
	 StDemo.display();
 }
}
