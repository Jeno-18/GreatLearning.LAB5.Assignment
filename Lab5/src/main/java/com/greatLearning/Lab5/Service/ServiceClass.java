package com.greatLearning.Lab5.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatLearning.Lab5.Entity.Employee;
import com.greatLearning.Lab5.Repository.EmployeeRepository;

@Service
public class ServiceClass {
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).get();
	}

	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public void deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);

	}

}
