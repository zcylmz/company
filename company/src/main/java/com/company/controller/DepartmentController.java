package com.company.controller;

import com.company.dto.CompanyDTO;
import com.company.dto.DepartmentDTO;
import com.company.entity.Company;
import com.company.entity.Department;
import com.company.service.CompanyService;
import com.company.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<Department> findAllCompany(){
        return departmentService.findAllDepartment();
    }

    @GetMapping("/{departmentId}")
    public Department findOne(@PathVariable("departmentId") Long id){

        return departmentService.findOne(id);
    }

    @PostMapping("/create")
    public Department createDepartment(@RequestBody @Valid DepartmentDTO departmentDTO){
        return departmentService.createDepartment(departmentDTO);
    }

    @DeleteMapping("/{companyId}")
    public void deleteDepartment( @PathVariable("companyId") Long id){
        departmentService.deleteDepartment(id);
    }
    @PatchMapping("/update")
    public Department updateDepartment(@RequestBody @Valid DepartmentDTO departmentDTO){
        return departmentService.updateDepartment(departmentDTO);
    }
}
