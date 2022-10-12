package com.que4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;



public class Demo {

	public static void main(String[] args) {
		Set<Student> li=new HashSet<>();
		
		li.add(new Student(1, "vin", "vin@", 200));
		li.add(new Student(2, "kin", "kin@", 600));
		li.add(new Student(3, "min", "min@", 400));
		li.add(new Student(4, "rin", "rin@", 300));
		li.add(new Student(5, "sin", "sim@", 100));
		li.add(new Student(4, "cin", "rin@", 200));
		
		Set<Student> x=li.stream().filter(a->a.getMarks()<500).collect(Collectors.toSet());
	
		x.forEach(System.out::println);
	}
}
