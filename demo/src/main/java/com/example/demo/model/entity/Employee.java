package com.example.demo.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer id;
    @Column(name = "employee_full_name")
    private String fullName;
    @Column(name = "employee_address")
    private String address;
    @Column(name = "employee_phone")
    private String phone;
    @Column(name = "employee_status")
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "department_id")
    private Department department;
}
