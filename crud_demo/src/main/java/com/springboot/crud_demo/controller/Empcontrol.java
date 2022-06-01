package com.springboot.crud_demo.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.crud_demo.entity.Employee;

public interface Empcontrol extends JpaRepository<Employee, Integer>{

}
