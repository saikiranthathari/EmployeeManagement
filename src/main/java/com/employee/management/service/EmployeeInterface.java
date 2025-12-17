package com.employee.management.service;

import java.util.List;

import com.employee.management.model.Employee;

public interface EmployeeInterface {

    // get all employees
    List<Employee> getAllEmployee();

    // create new employee
    Employee addEmployee(Employee em);

    // update employee
    Employee updateEmployee(Long id, Employee employee);
}
