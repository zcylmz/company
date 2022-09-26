package com.company.service;

import com.company.dto.DepartmentDTO;
import com.company.entity.Department;
import com.company.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;


public interface DepartmentService {

    List<Department> findAllDepartment();

    Department findOne(Long id);

    Department createDepartment(DepartmentDTO departmentDTO);

    void deleteDepartment(Long id);

    Department updateDepartment(DepartmentDTO departmentDTO);

    List<Employee> getEmployees(Long id);

}
