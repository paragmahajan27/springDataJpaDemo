package io.github.paragmahajan27.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@NoArgsConstructor
public class Employee {
	@Id
	@GeneratedValue
	public int id;
	
	public String name;
	
	public int salary;
	
	public String department;
	
	public Employee() {}
	
	public Employee(String name, int salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
}
