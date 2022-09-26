//package com.company.repository.Impl;
//
//import com.company.dto.DepartmentDTO;
//import com.company.entity.Company;
//import com.company.entity.Department;
//import com.company.entity.Employee;
//import com.company.repository.DepartmentRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//@Repository
//public class DepartmentRepositoryImpl implements DepartmentRepository {
//
//    private List<Department> departmentRepo= new ArrayList<>();
//
//    private static Long lastDepartmentId =0L;
//
//    @Override
//    public List<Department> findAllDepartment() {
//
//        return departmentRepo;
//    }
//
//    @Override
//    public Department findOne(Long id) {
//        return  departmentRepo.stream().filter(department -> department.getId().equals(id)).findFirst().orElse(null);
//
//    }
//
//    @Override
//    public Department createDepartment(DepartmentDTO departmentDTO) {
//
//
//        Department department = new Department();
//
//        department.setId(++lastDepartmentId);
//
//        department.setName(departmentDTO.getName());
//
//        department.setDescription(departmentDTO.getDescription());
//
//        department.setEmployeeList(departmentDTO.getEmployeeList());
//
//        departmentRepo.add(department);
//
//        return department;
//
//    }
//
//    @Override
//    public void deleteDepartment(Long id) {
//
//        return departmentRepo.remove(this.findOne(id));
//    }
//
//    @Override
//    public Department updateDepartment(DepartmentDTO departmentDTO) {
//
//        Department departmentToUpdate = this.findOne(departmentDTO.getId());
//
//        departmentToUpdate.setName(departmentDTO.getName());
//
//        departmentToUpdate.setDescription(departmentDTO.getDescription());
//
//        departmentToUpdate.setEmployeeList(departmentDTO.getEmployeeList());
//
//        return departmentToUpdate;
//    }
//
//    @Override
//    public List<Employee> getEmployees(Long id) {
//        return this.findOne(id).getEmployeeList();
//    }
//
//}
