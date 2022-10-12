package com.que2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		
		List<Student> li=new ArrayList<>();
		
		li.add(new Student(1, "vin", "vin@", 200));
		li.add(new Student(2, "kin", "kin@", 300));
		li.add(new Student(3, "min", "min@", 400));
		li.add(new Student(4, "rin", "rin@", 600));
		li.add(new Student(5, "sin", "sim@", 100));
		
		   Optional<Student> str=li.stream().max((s1,s2)-> s1.getMarks()>s2.getMarks()?+1:-1);
		   
		   Student student=str.get();
		   
		   System.out.println(student);
		   
	}
	
	
}
