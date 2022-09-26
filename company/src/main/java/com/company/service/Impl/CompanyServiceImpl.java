package com.company.service.Impl;

import com.company.dto.CompanyDTO;
import com.company.entity.Address;
import com.company.entity.Company;
import com.company.entity.Department;
import com.company.repository.AddressDbRepository;
import com.company.repository.CompanyDbRepository;
import com.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
public class CompanyServiceImpl implements CompanyService {


    @Autowired
    private CompanyDbRepository companyDbRepository;

    @Autowired
    private AddressDbRepository addressDbRepository;

    @Override
    public List<Company> findAllCompany() {

        return companyDbRepository.findAll();

    }

    @Override
    public Company findOne(Long id) {

        System.out.println(companyDbRepository.findById(id).orElseThrow(()-> new RuntimeException("Not found")));

        return companyDbRepository.findById(id).orElseThrow(()-> new RuntimeException("Not found"));
    }

    @Override
    public Company createCompany(CompanyDTO companyDTO) {

        Company company= new Company();
        Address address = companyDTO.getAddress();
        addressDbRepository.save(address);
        System.out.println("address created");
        company.setId(companyDTO.getId());
        company.setName(companyDTO.getName());
        company.setDescription(companyDTO.getDescription());
        company.setFounder(companyDTO.getFounder());
        company.setFoundationYear(companyDTO.getFoundationYear());
        company.setAddress(companyDTO.getAddress());
        return companyDbRepository.save(company);
    }

    @Override
    public void deleteCompany(Long id) {

        companyDbRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Company updateCompany(CompanyDTO companyDTO) {

        Optional<Company> companyOptional = companyDbRepository.findById(companyDTO.getId()) ;

        Company company = companyOptional.orElseThrow(()->new RuntimeException("Not Found"));

        return companyDbRepository.saveAndFlush(company);
    }


    @Override
    public List<Department> getDepartments(Long id) {

        Optional<Company> companyOptional = companyDbRepository.findById(id) ;

        Company company = companyOptional.orElseThrow(()->new RuntimeException("Not Found"));


        return company.getDepartmentList();

    }

}
