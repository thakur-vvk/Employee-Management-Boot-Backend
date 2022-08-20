package com.webapp.employee.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.employee.boot.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // CRUD Methods extending from JPA
}
