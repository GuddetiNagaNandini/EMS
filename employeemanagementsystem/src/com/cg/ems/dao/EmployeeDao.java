package com.cg.ems.dao;
import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;
import java.util.HashSet;

public interface EmployeeDao {
public int addEmployee(Employee ee)throws EmployeeException;
public HashSet<Employee> fetchAllEmp();
public Employee getEmpById(int empId);
public HashSet<Employee> searchEmpByName(String name);
public int deleteEmp(int empId);
public Employee updateEmp(int empId,String newName,float newSal);
}
