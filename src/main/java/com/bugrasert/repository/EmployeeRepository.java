package com.bugrasert.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bugrasert.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
