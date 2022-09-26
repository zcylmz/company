package com.company.service;

import com.company.dto.CompanyDTO;
import com.company.entity.Company;
import com.company.entity.Department;
import java.util.List;


public interface CompanyService {

    List<Company> findAllCompany();

    Company findOne(Long id);

    Company createCompany(CompanyDTO companyDTO);

    void deleteCompany(Long id);

    Company updateCompany(CompanyDTO companyDTO);

    List<Department> getDepartments(Long id);

}
