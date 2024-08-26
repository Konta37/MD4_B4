package com.example.demo.service.impl;

import com.example.demo.model.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Integer id) {
        return departmentRepository.findById(id).orElseThrow(()-> new NoSuchElementException("There is no Department with this: " + id + " id."));
    }

    @Override
    public Department insertDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department updateDepartment(Integer id, Department department) {
        departmentRepository.findById(id).orElseThrow(()-> new NoSuchElementException("There is no Department with this: " + id + " id."));
        department.setId(id);
        return departmentRepository.save(department);
    }

    @Override
    public void deleteDepartment(Integer id) {
        departmentRepository.findById(id).orElseThrow(()-> new NoSuchElementException("There is no Department with this: " + id + " id."));
        departmentRepository.deleteById(id);
    }

    @Override
    public List<Department> getDepartmentsByDepartmentName(String departmentName) {
        return departmentRepository.findDepartmentByNameContains(departmentName);
    }
}
