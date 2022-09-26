package com.company.dto;

import com.company.entity.Employee;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Data
public class DepartmentDTO {

    @NotNull
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotNull
    private List<Employee> employeeList;

    public DepartmentDTO(Long id, String name, String description, List<Employee> employeeList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.employeeList = employeeList;
    }

}
