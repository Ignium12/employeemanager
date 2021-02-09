package com.kruehl.employeemanager.repo;

import com.kruehl.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // custom method, spring data jpa automatically creates query
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
