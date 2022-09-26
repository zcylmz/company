package com.company.service.Impl;

import com.company.dto.DepartmentDTO;
import com.company.entity.Company;
import com.company.entity.Department;
import com.company.entity.Employee;
import com.company.repository.DepartmentDbRepository;
import com.company.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDbRepository departmentDbRepository;


    @Override
    public List<Department> findAllDepartment() {
        return departmentDbRepository.findAll();
    }

    @Override
    public Department findOne(Long id) {

        return departmentDbRepository.findById(id).orElseThrow(()-> new RuntimeException("Not found"));
    }

    @Override
    public Department createDepartment(DepartmentDTO departmentDTO) {

        Department department = new Department();


        return departmentDbRepository.saveAndFlush(department);
    }

    @Override
    public void deleteDepartment(Long id) {
        departmentDbRepository.deleteById(id);
    }

    @Override
    public Department updateDepartment(DepartmentDTO departmentDTO) {

        Optional<Department> departmentOptional = departmentDbRepository.findById(departmentDTO.getId()) ;
        Department department = departmentOptional.orElseThrow(()->new RuntimeException("Not Found"));

        return departmentDbRepository.saveAndFlush(department);
    }

    @Override
    public List<Employee> getEmployees(Long id) {

        Optional<Department> departmentOptional = departmentDbRepository.findById(id) ;
        Department department = departmentOptional.orElseThrow(()->new RuntimeException("Not Found"));

        return department.getEmployeeList();
    }

}
