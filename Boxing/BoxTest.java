package com.hcl.day4;

public class BoxTest {

	public void show(Object ob){
		String type=ob.getClass().getSimpleName();
		System.out.println(type);
		if(type.equals("Integer")){
			System.out.println("Integer casting...");
			int x=(Integer)ob;
		}
		if(type.equals("Double")){
			System.out.println("Double casting...");
			double x=(Double)ob;
		}
		if(type.equals("String")){
			System.out.println("String casting...");
			String x=(String)ob;
		}
	}
	public static void main(String[] args){
		int a=12;
		double b=12.5;
		String name="HCL";
		
		BoxTest obj=new BoxTest();
		obj.show(a);
		obj.show(b);
		obj.show(name);
	}

}
