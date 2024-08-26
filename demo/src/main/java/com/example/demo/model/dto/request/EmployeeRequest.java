package com.example.demo.model.dto.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EmployeeRequest {
    @NotBlank(message = "Full name is blank")
    private String fullName;
    @NotBlank(message = "Address is blank")
    private String address;
    @NotBlank(message = "Phone is blank")
    private String phone;
    @NotNull(message = "Status can't null")
    private Boolean status;
    @NotNull(message = "Department id is null")
    private Integer departmentId;
}
