package com.employee.management.customExceptions;

public class EmployeeNotFoundException extends Exception {

    public EmployeeNotFoundException() {
        super("Employee not found !!");
    }

    public EmployeeNotFoundException(String message) {
        super(message);
    }

    public EmployeeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
