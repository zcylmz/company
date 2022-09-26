package com.company.controller;

import com.company.dto.CompanyDTO;
import com.company.dto.EmployeeDTO;
import com.company.entity.Company;
import com.company.entity.Employee;
import com.company.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
         this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> findAllEmployee(){
        return employeeService.findAllEmployee();
    }

    @GetMapping("/{employeeId}")
    public Employee findOne(@PathVariable("employeeId") Long id){
        return employeeService.findOne(id);
    }

    @PostMapping("/employeec")
    public Employee createEmployee(@RequestBody @Valid EmployeeDTO employeeDTO){
        return employeeService.createEmployee(employeeDTO);
    }

    @DeleteMapping("/{employeeId}")
    public void deleteEmployee( @PathVariable("employeeId") Long id){
        employeeService.deleteEmployee(id);
    }

    @PatchMapping("/{employeeId}")
    public Employee updateEmployee(@RequestBody @Valid EmployeeDTO employeeDTO){
        return employeeService.updateEmployee(employeeDTO);
    }

}
