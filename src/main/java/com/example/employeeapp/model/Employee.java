package com.example.employeeapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * JPA entity representing an employee.
 * Only the employee's name is stored, as required.
 */
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Employee name is required.")
    @Size(max = 100, message = "Employee name must not exceed 100 characters.")
    private String name;

    /**
     * No-argument constructor required by JPA.
     */
    public Employee() {
    }

    /**
     * Convenience constructor for creating a new employee before it has an id.
     */
    public Employee(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
