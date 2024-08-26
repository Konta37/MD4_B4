package com.example.demo.repository;

import com.example.demo.model.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    List<Department> findDepartmentByNameContains(String fullName);
}
