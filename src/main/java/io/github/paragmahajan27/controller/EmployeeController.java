package io.github.paragmahajan27.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.github.paragmahajan27.model.Employee;
import io.github.paragmahajan27.service.EmployeeService;

@RestController
public class EmployeeController {

	public Logger logger = Logger.getLogger(EmployeeController.class);
	
	@Autowired
	public EmployeeService empService;
	
	@PostConstruct
	public void initEmp() {
		logger.info("Initializing H2 Database Employee table");
		empService.createEmployee("Ranbir Kapoor", 10000000, "Entertainment");
		empService.createEmployee("Ranveer Singh", 20000000, "Entertainment");
		empService.createEmployee("Shashi Tharoor", 15000000, "Politics");
		empService.createEmployee("Virat Kohli", 30000000, "Sports");
	}
	
	@GetMapping("/employee/{employeeName}")
	public Employee getByName(@PathVariable String employeeName) {
		return empService.getByName(employeeName);
	}

	@GetMapping("/department/{deptName}")
	public List<Employee> getByDepartment(@PathVariable String deptName) {
		return empService.getByDepartment(deptName);
	}
	
}
