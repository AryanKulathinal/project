package com.example.demo1.service;

import com.example.demo1.entity.EmployeeEntity;
import com.example.demo1.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployee(long empId);
    Employee addEmployee(Employee newEmployee);
    Employee updateEmployee(Employee editEmployee);
    void deleteEmployee(long empId);
    List<EmployeeEntity> getAllEmployeesByDepartment(long did);

}
