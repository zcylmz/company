package com.company.repository;

import com.company.dto.DepartmentDTO;
import com.company.entity.Department;
import com.company.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface DepartmentDbRepository extends JpaRepository<Department, Long>{



}
