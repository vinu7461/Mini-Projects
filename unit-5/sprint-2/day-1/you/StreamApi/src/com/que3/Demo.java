package com.que3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

public static void main(String[] args) {
	
	List<Integer> li=Arrays.asList(10,20,5,3);
	
	List<Integer> x=li.stream().map(i->i*i).collect(Collectors.toList());
	
	li.forEach(l->System.out.println(l));
	System.out.println("-------------------------------");
	x.forEach(l->System.out.println(l));
}	
	
}
