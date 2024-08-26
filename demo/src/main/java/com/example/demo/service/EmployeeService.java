package com.example.demo.service;

import com.example.demo.model.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Integer id);
    Employee insertEmployee(Employee Employee);
    Employee updateEmployee(Integer id,Employee Employee);
    void deleteEmployee(Integer id);
    List<Employee> getEmployeesByEmployeeName(String EmployeeName);
}
