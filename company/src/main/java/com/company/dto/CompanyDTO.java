package com.company.dto;

import com.company.entity.Address;
import lombok.Data;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CompanyDTO {
    @NotNull
    private Long id;

    @NotBlank
    private String name;

    private String description;

    @NotBlank
    private String founder;

    @NotBlank
    private String foundationYear;

    @NotNull
    private Address address;

}
