package com.hcl.foreach;

import java.util.ArrayList;
import java.util.List;

public class LambdaProduct {
	public static void main(String[] args) {
		List<Product>list=new ArrayList<Product>();
		list.add(new Product(1,"Samsung a5",15222));
		list.add(new Product(2,"iphone 6s",18236));
		list.add(new Product(3,"Sony xperia",45213));
		list.add(new Product(4,"nokia lumia",52852));
		list.add(new Product(5,"Redmi4",100000));
		list.add(new Product(6,"lenevo vibe",14569));
		
		list.stream().filter(p ->p.price>=20000).forEach(x ->{
		System.out.println(x);
		});
		list.stream().filter(p-> p.name.startsWith("S")).forEach(x ->{
			System.out.println(x);
		});
		
		System.out.println("max mobile price----------------\n");
		Product maxProduct=list.stream().max((p1,p2)
        ->p1.price >=p2.price
        ?1:-1).get();
        System.out.println(maxProduct);
        
        System.out.println("min price mobile-------------\n ");
        Product minProduct=list.stream().min((p1,p2)
                ->p1.price >=p2.price
                ?1:-1).get();
                System.out.println(minProduct);
                System.out.println("first 3 records");
                list.stream().limit(3).forEach(p->{
                	System.out.println(p);
                });
                System.out.println("after skipping 2 records");
                list.stream().skip(2).forEach(p->{
                	System.out.println(p);
                });
        		
		
	}

}
