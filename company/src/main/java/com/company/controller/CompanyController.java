package com.company.controller;

import com.company.dto.CompanyDTO;
import com.company.entity.Company;
import com.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("company")
public class    CompanyController {
    @Autowired
    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public List<Company> findAllCompany(){
        return companyService.findAllCompany();
    }

    @GetMapping("/{companyId}")
    public Company findOne(@PathVariable("companyId") Long id){
        return companyService.findOne(id);
    }

    @PostMapping(value = "/create")
    public Company createCompany(@RequestBody @Valid CompanyDTO companyDTO){
        return companyService.createCompany(companyDTO);
    }

    @DeleteMapping("/{companyId}")
    public void deleteCompany( @PathVariable("companyId") Long id){
        companyService.deleteCompany(id);
    }

    @PatchMapping("/update")
    public Company updateCompany(@RequestBody @Valid CompanyDTO companyDTO){
        return companyService.updateCompany(companyDTO);
    }

}


//   {
//        "id": 2,
//        "name": "ASELSAN",
//        "description": "test test test",
//        "founder": "Uğur Çoşkun",
//        "foundationYear": "14.03.2005",
//        "address": null
//    }