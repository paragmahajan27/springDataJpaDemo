package io.github.paragmahajan27.springDataJpaDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.paragmahajan27.springDataJpaDemo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

	public Employee getByName(String name);
	public List<Employee> getByDepartment(String dept);
}
