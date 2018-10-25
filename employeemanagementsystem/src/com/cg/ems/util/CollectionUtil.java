package com.cg.ems.util;
import com.cg.ems.dto.Employee;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;

public class CollectionUtil
{
 private static HashSet<Employee> empSet=new HashSet<Employee>();
           
 static
 {
	    empSet.add(new Employee(1012333,"Nandini",1000.0F,LocalDate.of(2014, Month.MARCH, 04)));
		empSet.add(new Employee(1112222,"Vaishali",2000.0F,LocalDate.of(2016, Month.SEPTEMBER, 04)));
		empSet.add(new Employee(1212555,"Dinesh",7800.0F,LocalDate.of(2014, Month.MARCH, 24)));
		empSet.add(new Employee(1312333,"Nandini",1000.0F,LocalDate.of(2018, Month.SEPTEMBER, 19)));
	 
 }
 public static void addEmp(Employee emp)
 {
	 empSet.add(emp);
 }
 public static HashSet<Employee> getAllEmp()
 {
	return empSet; 
 }
}
