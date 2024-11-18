package com.example.datajpa.controller;

import com.example.datajpa.entity.Employee;
import com.example.datajpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String InsertEmployee(){
        Employee emp = new Employee();
        emp.setName("swarna");
        emp.setDesignation("software Engineer");
        emp.setDepartment("IT");
        emp.setExp(1);

        Employee employee= employeeService.saveEmployee(emp);
        return "Employee = "+employee.getName()+" "+employee.getDesignation()+" "+employee.getDepartment()+" "+employee.getExp();
    }
}
