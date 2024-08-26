package com.example.demo.service.impl;

import com.example.demo.model.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElseThrow(()-> new NoSuchElementException("There is no employee with id " + id));
    }

    @Override
    public Employee insertEmployee(Employee Employee) {

        return employeeRepository.save(Employee);
    }

    @Override
    public Employee updateEmployee(Integer id, Employee Employee) {
        employeeRepository.findById(id).orElseThrow(()-> new NoSuchElementException("There is no employee with id " + id));
        Employee.setId(id);
        return employeeRepository.save(Employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepository.findById(id).orElseThrow(()-> new NoSuchElementException("There is no employee with id " + id));
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getEmployeesByEmployeeName(String EmployeeName) {
        return employeeRepository.findEmployeeByFullNameContains(EmployeeName);
    }
}
