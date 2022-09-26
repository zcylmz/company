//package com.company.repository.Impl;
//
//import com.company.dto.EmployeeDTO;
//import com.company.entity.Company;
//import com.company.entity.Employee;
//import com.company.repository.EmployeeRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class EmployeeRepositoryImpl implements EmployeeRepository  {
//
//    private static List<Employee> employeeRepo = new ArrayList<>();
//
//    private static Long lastEmployeeId =0L;
//
//    @Override
//    public List<Employee> findAllEmployee() {
//        return employeeRepo;
//    }
//
//    @Override
//    public Employee findOne(Long id) {
//        return employeeRepo.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
//    }
//
//    @Override
//    public Employee createEmployee(EmployeeDTO employeeDTO) {
//
//        Employee employee = new Employee();
//
//        employee.setId(++lastEmployeeId);
//        employee.setName(employeeDTO.getName());
//        employee.setSurname(employeeDTO.getSurname());
//        employee.setBirthDay(employeeDTO.getBirthDay());
//        employee.setStartDate(employeeDTO.getStartDate());
//        employee.setDescription(employeeDTO.getDescription());
//
//        employee.setAddress(employeeDTO.getAddress());
//        employee.setTitle(employeeDTO.getTitle());
//        employee.setDepartment(employeeDTO.getDepartment());
//
//        employeeRepo.add(employee);
//
//        return employee;
//    }
//
//    @Override
//    public void deleteEmployee(Long id) {
//
//        return employeeRepo.remove(this.findOne(id));
//
//    }
//
//    @Override
//    public Employee updateEmployee(EmployeeDTO employeeDTO) {
//
//        Employee employeeToUpdate = this.findOne(employeeDTO.getId());
//
//        employeeToUpdate.setName(employeeDTO.getName());
//        employeeToUpdate.setSurname(employeeDTO.getSurname());
//        employeeToUpdate.setBirthDay(employeeDTO.getBirthDay());
//        employeeToUpdate.setStartDate(employeeDTO.getStartDate());
//        employeeToUpdate.setDescription(employeeDTO.getDescription());
//        employeeToUpdate.setAddress(employeeDTO.getAddress());
//        employeeToUpdate.setTitle(employeeDTO.getTitle());
//
//        return employeeToUpdate;
//    }
//
//}
