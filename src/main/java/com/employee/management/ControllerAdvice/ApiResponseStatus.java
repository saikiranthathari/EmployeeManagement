package com.employee.management.ControllerAdvice;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponseStatus {
    private String message;
    private boolean actionStatus;
    private HttpStatus apiStatusCode;
}
