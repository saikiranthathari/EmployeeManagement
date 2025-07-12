package com.employee.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.management.model.Employee;
import com.employee.management.repo.EmployeeRepo;
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo emp;

    public List<Employee> getAllEmployee()
    {
       return emp.findAll();
    }

    public Employee addEmployee(Employee em)
    {
        return emp.save(em);
    }

    public Employee updateEmployee(Long id ,Employee employee)
    {
        Optional<Employee> em = emp.findById(id);
        em.get().setName(employee.getName());
        em.get().setDepartment(employee.getDepartment());
        return emp.save(em.get());
    }
}
