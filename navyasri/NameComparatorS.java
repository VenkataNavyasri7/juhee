package com.hcl.collections;

import java.util.Comparator;

public class NameComparatorS implements Comparator{

	@Override
	public int compare(Object s1, Object s2) {
	Student1 t1=(Student1)s1;
	Student1 t2=(Student1)s2;
	return t2.sname.compareTo(t1.sname);
	}
	
}	