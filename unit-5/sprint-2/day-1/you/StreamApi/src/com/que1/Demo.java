package com.que1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		
		List<Product> li=new ArrayList<>();
		
	    li.add(new Product(1,"shoes", 300, 1));
	    li.add(new Product(2, "pen", 20, 11));
	    li.add(new Product(4, "ball", 30, 2));
	    li.add(new Product(3, "rubber", 5, 13));
	    li.add(new Product(5, "jack", 300, 2));
	    
	 List<Product>list=  li.stream().filter(s-> s.getQuantity()>10).collect(Collectors.toList());
	 
	 list.sort((o1, o2) -> {
		if (o1.getPrice()>o2.getPrice()) return +1;
		else return -1;
	 });
	 
	 li.forEach(s->System.out.println(s));
	 System.out.println("======================================");
	 list.forEach(s->System.out.println(s));
	 
	}
}
