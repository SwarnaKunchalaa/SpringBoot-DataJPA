package com.example.datajpa.service;

import com.example.datajpa.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
    public Employee findById(long id);
    public List<Employee> findAll();
}
