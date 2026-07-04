package com.example.employeeapp.repository;

import com.example.employeeapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for Employee persistence.
 * Spring Data JPA generates the implementation at runtime,
 * so no raw SQL is required.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
