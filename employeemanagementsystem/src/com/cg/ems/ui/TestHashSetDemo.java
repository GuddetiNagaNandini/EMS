package com.cg.ems.ui;
import com.cg.ems.dto.Employee;

import java.util.HashSet;
import java.util.TreeSet;

public class TestHashSetDemo {
	public static void main(String[] args)
			{
		HashSet<Employee> emps=new HashSet<Employee>();
		emps.add(new Employee(333,"Nandini",1000.0F, null));
		emps.add(new Employee(222,"Vaishali",2000.0F, null));
		emps.add(new Employee(555,"Dinesh",7800.0F, null));
		emps.add(new Employee(333,"Nandini",1000.0F, null));
		System.out.println(emps);
		System.out.println("****************");
		
		TreeSet<String>cities=new TreeSet<String>();
		cities.add("Pune");
		cities.add("Hyderabad");
		cities.add("Bombay");
		cities.add("Noida");
		System.out.println(cities);
		System.out.println("***********************");
		TreeSet<Employee> emps2=new TreeSet<Employee>();
		emps2.add(new Employee(333,"Nandini",1000.0F, null));
		emps2.add(new Employee(222,"Vaishali",2000.0F, null));
		emps2.add(new Employee(555,"Dinesh",7800.0F, null));
		emps2.add(new Employee(333,"Nandini",1000.0F, null));
		System.out.println(emps2);
		
			}

}
