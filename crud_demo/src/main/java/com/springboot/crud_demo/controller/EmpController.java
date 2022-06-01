package com.springboot.crud_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crud_demo.dao.EmployeeDao;
import com.springboot.crud_demo.entity.Employee;

@RestController
@RequestMapping(value = "employee")
public class EmpController {

	@Autowired
	EmployeeDao empdao;

	@GetMapping
	public List<Employee> getEmployee() {
		return empdao.getEmployees();
	}

	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return empdao.getEmployee(id);
	}
	
	@PostMapping
    public Employee addEmployee(@RequestBody Employee emp){
        return empdao.addEmployee(emp);
    }

	

}
