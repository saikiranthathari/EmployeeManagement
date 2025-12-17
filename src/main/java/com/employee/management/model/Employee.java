package com.employee.management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Employee name shouldn't be empty.")
    private String name;
    @NotNull(message = "Department Id shouldn't be empty.")
    private Long departmentId;
    @NotNull(message = "Role Id shouldn't be empty.")
    private Long roleId;

    @Transient
    private RoleDetails roleDetails;
}
