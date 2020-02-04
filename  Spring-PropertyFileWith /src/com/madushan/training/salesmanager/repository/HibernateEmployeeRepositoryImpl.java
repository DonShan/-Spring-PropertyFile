package com.madushan.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import com.madushan.training.salesmanager.model.Employee;

@Repository("you-can-use-anyname")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	@Value("$ {name}")
	private String employeeName;
	@Value("${city}")
	private String employeeCity;
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setEmployeeName("Madushan");
		employee.setEmployeeLocation("Kalaniya");
		employees.add(employee);
		return employees;
	}

}
