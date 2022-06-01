package com.springboot.crud_demo.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud_demo.controller.Empcontrol;
import com.springboot.crud_demo.entity.Employee;

@Service
public class EmployeeDao{
	
	
	@Autowired
	Empcontrol jparepo;
	
	public List<Employee> getEmployees(){
        return jparepo.findAll();
    }
	
	public Employee getEmployee(int id){
        Optional<Employee> emp = jparepo.findById(id);

        return emp.get();
    }
    public Employee addEmployee(Employee emp){
        return jparepo.save(emp);
    }
	

}
