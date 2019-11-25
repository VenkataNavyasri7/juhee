package com.hcl.jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hcl.foreach.Product;



public class EmploySort {
	public static void main(String[] args) {
		List<EmployS>list=new ArrayList<EmployS>();
		list.add(new EmployS(1,"navya","Software","software engineer",85200));
		list.add(new EmployS(2,"kavya","hardware","software engineer",42200));
		list.add(new EmployS(3,"sravya","testing","software engineer",96200));
		list.add(new EmployS(4,"divya","maintanance","software engineer",79200));
		list.add(new EmployS(5,"htvya","Software","software engineer",25200));
		System.out.println("sort name wise");
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		list.forEach(p->{
			System.out.println(p);
		});
		list.stream().filter(h->h.dept.startsWith("java")).forEach(m->{
			System.out.println(m);
		});
		list.stream().filter(p->p.basic>50000).forEach(x->{
			System.out.println(x);
		});
		EmployS maxBasic=list.stream().max((p1,p2)->p1.basic>=p2.basic?1:-1).get();
		System.out.println(maxBasic);
		EmployS minBasic=list.stream().min((p1,p2)->p1.basic>=p2.basic?1:-1).get();
		System.out.println(minBasic);
		list.stream().limit(3).forEach(p->{
			System.out.println(p);
		});
		
		System.out.println("sorted data");
		Collections.sort(list,(e1,e2)->{
			return (int)(e2.basic-e1.basic);
			
		});
		list.stream().forEach(p->{
			System.out.println(p);
		});
		System.out.println("data after skipping two records");
		list.stream().skip(2).forEach(p->{
			System.out.println(p);
		});
		Collections.sort(list,(p1,p2)->{
			return (int)(p1.basic-p2.basic);
		});
		list.forEach(p->{
			System.out.println(p);
			
		});
			
			
	}

}


