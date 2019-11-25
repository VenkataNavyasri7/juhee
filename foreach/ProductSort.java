package com.hcl.foreach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ProductSort {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"Samsung a5",15222));
		list.add(new Product(2,"iphone 6s",18236));
		list.add(new Product(3,"Sony xperia",45213));
		list.add(new Product(4,"nokia lumia",52852));
		list.add(new Product(5,"Redmi4",100000));
		list.add(new Product(6,"lenevo vibe",14569));
		Collections.sort(list,(p1,p2)->{
		return p1.name.compareTo(p2.name);
		});
		list.forEach(p->{
			System.out.println(p);
		});
		
		System.out.println("Price wise \n .........");
		Collections.sort(list,(p1,p2)-> {
		    if(p1.price >=p2.price) {
		return 1;

		}else{
		return -1;
		}
		});
		list.forEach(p-> {
		System.out.println(p);
		});

	}

}
