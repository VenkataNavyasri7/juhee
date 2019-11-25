package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrListDemo {
	
	public static void main(String[] args) 
	{
		List names=new ArrayList();
	
		names.add("navya");
		names.add("samitha");
		names.add("priya");
		names.add("anusha");
		names.add("kavya");
		System.out.println("names are ");
		for (Object ob : names) 
		{
			System.out.println(ob);
			
		}
		names.add(2,"harika");
		System.out.println("after adding the list is");
		for (Object ob : names) {
			System.out.println(ob);
			
		}
		names.set(3, "jana priya");
		System.out.println("names after editing");
		for (Object ob : names) {
			System.out.println(ob);
			
		}names.remove("samitha");
		System.out.println("list after removing that name");
		for (Object ob : names) {
			System.out.println(ob);
			
		}
	}

}
