package com.hcl.map;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator<Employ> c=new SalaryComparator();
		SortedSet<Employ> employs=new TreeSet<Employ>(c);
		employs.add(new Employ(1,"navya","Software","software engineer",85200));
		employs.add(new Employ(2,"kavya","hardware","software engineer",42200));
		employs.add(new Employ(3,"sravya","testing","software engineer",96200));
		employs.add(new Employ(4,"divya","maintanance","software engineer",79200));
		employs.add(new Employ(5,"htvya","Software","software engineer",25200));
		for (Employ employ : employs) {
			System.out.println(employ);
		}
	}

}
