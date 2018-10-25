package com.cg.ems.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.regex.Pattern;

import com.cg.ems.dao.EmpDaoImp;
import com.cg.ems.dao.EmployeeDao;
import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService
{
	public LocalDate convertFromStrToLocalDate(String dtStr) {
		// TODO Auto-generated method stub
	DateTimeFormatter myFormat=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate date=LocalDate.parse(dtStr, myFormat);
	
		return date;
	
	}
EmployeeDao empDao=null;
public EmployeeServiceImpl()
	{
	empDao=new EmpDaoImp();	
	}
	@Override
	public int addEmployee(Employee ee) throws EmployeeException {
		// TODO Auto-generated method stub
		return empDao.addEmployee(ee);
	}

	@Override
	public HashSet<Employee> fetchAllEmp() {
		// TODO Auto-generated method stub
		return empDao.fetchAllEmp();
	}

	@Override
	public Employee getEmpById(int empId) {
		// TODO Auto-generated method stub
		return empDao.getEmpById(empId);
	}

	@Override
	public HashSet<Employee> searchEmpByName(String name) {
		// TODO Auto-generated method stub
		return empDao.searchEmpByName(name);
	}

	@Override
	public int deleteEmp(int empId) {
		// TODO Auto-generated method stub
		return empDao.deleteEmp(empId);
	}

	@Override
	public Employee updateEmp(int empId, String newName, float newSal) {
		// TODO Auto-generated method stub
		return empDao.updateEmp(empId,newName,newSal);
	}

	@Override
	public boolean validateDigit(int num) throws EmployeeException 
	{
		// TODO Auto-generated method stub
		Integer input=new Integer(num);//boxing converting string to num
		String inputStr=input.toString();
		String digitPatter="[0-9]+";
		if(Pattern.matches(digitPatter, inputStr))
		{
			return true;
		}
		else
		{
			throw new EmployeeException("Invalid Input"+" only digits");
		}
	}
		@Override
		public boolean validateName(String name) throws EmployeeException
		{
			// TODO Auto-generated method stub
			String namePatter="[A-Z][a-z]+";
			
			if(Pattern.matches(namePatter, name))
			{
				return true;
			}
			else
			{
				throw new EmployeeException("Invalid Input"+" only characters are allowed "+"should start with caps");
			}
	}
	


}
