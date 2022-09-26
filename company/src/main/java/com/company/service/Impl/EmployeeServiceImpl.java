package com.company.service.Impl;

import com.company.dto.EmployeeDTO;
import com.company.entity.Employee;
import com.company.repository.EmployeeDbRepository;
import com.company.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDbRepository employeeDbRepository;

    @Override
    public List<Employee> findAllEmployee() {

        return employeeDbRepository.findAll();
    }

    @Override
    public Employee findOne(Long id) {

        return employeeDbRepository.findById(id).orElseThrow(()-> new RuntimeException("Not found"));
    }

    @Override
    public Employee createEmployee(EmployeeDTO employeeDTO) {

        Employee employee = new Employee();

        return employeeDbRepository.saveAndFlush(employee);
    }

    @Override
    public void deleteEmployee(Long id) {

        employeeDbRepository.deleteById(id);
    }

    @Override
    public Employee updateEmployee(EmployeeDTO employeeDTO) {

        Optional<Employee> employeeOptional = employeeDbRepository.findById(employeeDTO.getId());
        Employee employee = employeeOptional.orElseThrow(()-> new RuntimeException("Not found"));

        return employeeDbRepository.saveAndFlush(employee);
    }

}
