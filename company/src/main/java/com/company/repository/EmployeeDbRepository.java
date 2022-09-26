package com.company.repository;

import com.company.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDbRepository extends JpaRepository<Employee, Long> {

}
