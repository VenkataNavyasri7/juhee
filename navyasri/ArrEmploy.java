package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrEmploy {

	public static void main(String[] args) {
		List employ=new ArrayList();
		employ.add(new Employ(1,"navya",78452));
		employ.add(new Employ(2,"navya",78452));
		employ.add(new Employ(3,"navya",78452));
		employ.add(new Employ(4,"navya",78452));
		employ.add(new Employ(5,"navya",78452));
		
		for (Object ob: employ) {
			Employ e=(Employ)ob;
			System.out.println(e);
		}
	}
}
