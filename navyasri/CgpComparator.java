package com.hcl.collections;

import java.util.Comparator;

public class CgpComparator implements Comparator{
//refer student1 pgm
	@Override
	public int compare(Object s1, Object s2) {
		StudentArr t1=(StudentArr)s1;
		StudentArr t2=(StudentArr)s2;
		if(t1.cgp>=t2.cgp){
			return 1;
			
		}else{
			return -1;
		}
		
	}

}
