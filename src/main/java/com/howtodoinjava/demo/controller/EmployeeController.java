package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Employee;

@RestController
public class EmployeeController {

	Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@RequestMapping("/employee/list")
    public List<Employee> getEmployees() 
    {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		logger.info("Enter Employee Controller......");
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"lokesh","gupta","test@gmail.com", "9008101522"));
		logger.info("Exit Employee Controller......");
		//logger.info("ends in {} stopWatch.stop());
		return employeesList;
    }

}
