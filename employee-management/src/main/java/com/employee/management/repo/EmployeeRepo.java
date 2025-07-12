package com.employee.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.management.model.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
