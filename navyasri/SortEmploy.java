package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator c=new BasicComparator();
		
		SortedSet s=new TreeSet(c);
		s.add(new Employ(1,"navya",18452));
		s.add(new Employ(2,"kavya",38452));
		s.add(new Employ(3,"ravya",78452));
		s.add(new Employ(4,"bavya",28452));
		s.add(new Employ(5,"oavya",4452));
		for (Object ob : s) {
			Employ e=(Employ)ob;
			System.out.println(e);
			
		}
	}

}
