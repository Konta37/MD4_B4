package com.example.demo.controller;

import com.example.demo.model.dto.response.DataResponse;
import com.example.demo.model.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    //get all
    @GetMapping
    public ResponseEntity<DataResponse> getAllDepartments() {
        return new ResponseEntity<>(new DataResponse(departmentService.getAllDepartments(), HttpStatus.OK), HttpStatus.OK);
    }

    //insert new department
    @PostMapping
    public ResponseEntity<DataResponse> addDepartment(@RequestBody Department department) {
        return new ResponseEntity<>(new DataResponse(departmentService.insertDepartment(department), HttpStatus.CREATED), HttpStatus.CREATED);
    }

    //find department by id
    @GetMapping("/{departmentId}")
    public ResponseEntity<DataResponse> getDepartmentById(@PathVariable Integer departmentId) {
        return new ResponseEntity<>(new DataResponse(departmentService.getDepartmentById(departmentId), HttpStatus.OK), HttpStatus.OK);
    }


}
