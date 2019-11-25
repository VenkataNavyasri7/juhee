package com.hcl.generics;

import java.util.ArrayList;
import java.util.List;

import com.hcl.collections.Employ;

public class GenEmploy {
	public static void main(String[] args) {
		List<Employ> employ=new ArrayList<Employ>();
		employ.add(new Employ(1,"navya",78452));
		employ.add(new Employ(2,"kavya",78452));
		employ.add(new Employ(3,"sravya",78452));
		employ.add(new Employ(4,"tmvya",78452));
		employ.add(new Employ(5,"eavya",78452));
		for (Employ emp : employ) {
			System.out.println(emp);
		}
	}

}
