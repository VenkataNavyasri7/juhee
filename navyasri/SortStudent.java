package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
		Comparator c=new NameComparatorS();
		SortedSet s=new TreeSet(c);
		s.add(new Student1(1,"avya",8.8));
		s.add(new Student1(2,"kavya",7.8));
		s.add(new Student1(3,"ravya",6.5));
		s.add(new Student1(4,"bavya",8.9));
		s.add(new Student1(5,"oavya",8.2));
		for (Object ob : s) {
			Student1 e=(Student1)ob;
			System.out.println(e);
		
	}

	}
}
