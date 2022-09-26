package com.company.service;

import com.company.dto.EmployeeDTO;
import com.company.entity.Company;
import com.company.entity.Employee;

import java.util.List;
import java.util.Set;

public interface EmployeeService {

    List<Employee> findAllEmployee();

    Employee findOne(Long id);

    Employee createEmployee(EmployeeDTO employeeDTO);

    void deleteEmployee(Long id);

    Employee updateEmployee(EmployeeDTO employeeDTO);


}
