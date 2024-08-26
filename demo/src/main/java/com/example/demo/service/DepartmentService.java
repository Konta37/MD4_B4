package com.example.demo.service;

import com.example.demo.model.entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDepartmentById(Integer id);
    Department insertDepartment(Department department);
    Department updateDepartment(Integer id,Department department);
    void deleteDepartment(Integer id);
    List<Department> getDepartmentsByDepartmentName(String departmentName);
}
