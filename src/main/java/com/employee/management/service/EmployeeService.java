package com.employee.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.employee.management.model.Employee;
import com.employee.management.model.RoleDetails;
import com.employee.management.repo.EmployeeRepo;

@Service
public class EmployeeService implements EmployeeInterface {

    @Autowired
    private EmployeeRepo emp;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employees = emp.findAll();

        return employees.stream().map(employee -> {
            // Fetch role details using the roleId from the employee
            Long roleId = employee.getRoleId();
            RoleDetails roleDetails = restTemplate.getForObject("http://role-service/api/roles/" + roleId,
                    RoleDetails.class);
            employee.setRoleDetails(roleDetails);
            return employee;
        }).toList();
    }

    @Override
    public Employee addEmployee(Employee em) {
        return emp.save(em);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Optional<Employee> em = emp.findById(id);
        em.get().setName(employee.getName());
        em.get().setDepartmentId(employee.getDepartmentId());
        em.get().setRoleId(employee.getRoleId());
        return emp.save(em.get());
    }
}
