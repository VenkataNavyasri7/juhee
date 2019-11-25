package com.hcl.foreach;

import java.util.ArrayList;
import java.util.List;

public class lambda4 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(7);
		list.add(1);
		list.add(25);
		list.add(1);
		int sum=list.stream().reduce(0, (e1,e2)->e1+e2);
		System.out.println(sum);
		
	}

}
