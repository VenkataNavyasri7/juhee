package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo {
	public static void main(String[] args) {
		
	
	SortedSet s=new TreeSet();
	s.add("teja");
	s.add("sravya");
	s.add("teja");
	s.add("kavya");
	s.add("teja");
	s.add("bhaavya");
	s.add("teja");
	s.add("bharath");
	for (Object ob : s) {
		System.out.println(ob);
		
	}
		
			
			
	

}
}