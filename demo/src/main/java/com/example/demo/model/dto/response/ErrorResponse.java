package com.example.demo.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

//setting error
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ErrorResponse<T> {
    private String message;
    private T content;
    private HttpStatus httpStatus;
}
