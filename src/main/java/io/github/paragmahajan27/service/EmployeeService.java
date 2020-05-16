package io.github.paragmahajan27.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.paragmahajan27.model.Employee;
import io.github.paragmahajan27.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	public EmployeeRepository employeeRepo;
	
	public void createEmployee(String name, int salary, String department) {
		Employee e = new Employee(name, salary, department);
		employeeRepo.save(e);
	}
	
	public Employee getByName(String name) {
		return employeeRepo.getByName(name);
	}
	
	public List<Employee> getByDepartment(String dept) {
		return employeeRepo.getByDepartment(dept);
	}
}