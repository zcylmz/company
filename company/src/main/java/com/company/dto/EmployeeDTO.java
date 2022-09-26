package com.company.dto;

import com.company.entity.Address;
import com.company.entity.Department;
import com.company.entity.Title;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class EmployeeDTO {

    @NotNull
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String surname;

    @NotBlank
    private String birthDay;

    @NotBlank
    private String startDate;

    private Title title;

    private String description;


    private Address address;


    private Department department;

    public EmployeeDTO(String name, String surname, String birthDay, String startDate, String description, Address address, Department department) {
        super();
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.startDate = startDate;
        this.description = description;
        this.address = address;
        this.department = department;
    }


}
