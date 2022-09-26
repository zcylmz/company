package com.company.repository.Impl;


//import javax.annotation.PostConstruct;
//import javax.transaction.Transactional;
//import java.util.*;
//
//@Repository
//
//public class CompanyRepositoryImpl implements CompanyRepository{
//
//    @Autowired
//    private CompanyDbRepository companyDbRepository;
//
//    @Autowired
//    private CompanyRepository companyRepository;
//
//    private List<Company> companyList = new ArrayList<>();
//
//    private static Long lastCompanyId =0L;
//
//    @PostConstruct
//    public void initCompany(){
//
//        Company company = new Company();
//
//        company.setId(++lastCompanyId);
//        company.setName("Bites");
//        company.setFounder("Uğur Çoşkun");
//        company.setFoundationYear("14.03.2005");
//        company.setDescription("test test test");
//
//        Address address = new Address();
//        address.setId(++IdGenerator.lastAddressId);
//        address.setStreet("Kızılırmak");
//        address.setProvince("Çankaya");
//        address.setCity("Ankara");
//        address.setAddressNo("No: 62/11");
//
//        company.setAddress(address);
//
//        companyList.stream().toList().add(company);
//
//    }
//
//    @Override
//    public List<Company> findAllCompany() {
//        return companyList;
//    }
//
//    @Override
//    public Company findOne(Long id) {
//      return  companyList.stream().filter(company -> company.getId().equals(id)).findFirst().orElse(null);
//    }
//
//    @Override
//    public Company createCompany(CompanyDTO companyDTO) {
//
//        Company company = new Company();
//
//        company.setId(++lastCompanyId);
//
//        company.setName(companyDTO.getName());
//
//        company.setFounder(companyDTO.getFounder());
//
//        company.setFoundationYear(companyDTO.getFoundationYear());
//
//        company.setDescription(companyDTO.getDescription());
//
//        company.setAddress(companyDTO.getAddress());
//
//        companyList.add(company);
//
//        return company;
//    }
//
//    @Override
//    public void deleteCompany(Long id) {
//
//
//        return companyList.remove(this.findOne(id));
//    }
//
//    @Override
//    @Transactional
//    public Company updateCompany(CompanyDTO companyDTO) {
//
//        Company companyToUpdate = this.findOne(companyDTO.getId());
//
//        companyToUpdate.setName(companyDTO.getName());
//        companyToUpdate.setFoundationYear(companyDTO.getFoundationYear());
//        companyToUpdate.setFounder(companyDTO.getFounder());
//        companyToUpdate.setDescription(companyDTO.getDescription());
//        companyToUpdate.setAddress(companyDTO.getAddress());
//
//        return companyToUpdate;
//    }
//
//    @Override
//    public List<Department> getDepartments(Long id) {
//        return this.findOne(id).getDepartmentList();
//
//    }
//
//
//}
