package com.example.demo1.controller;

import com.example.demo1.entity.EmployeeEntity;
import com.example.demo1.model.Employee;
import com.example.demo1.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    EmployeeService empService;

    public static final Logger LOG= LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    public EmployeeController(EmployeeService empService){
        this.empService=empService;

    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        LOG.info("in getAllEmployees");
        return empService.getAllEmployees();

    }

    @GetMapping("/employees/{eid}")
    public Employee getEmployee(@PathVariable("eid") long empId){
        LOG.info("in getEmployee");
        return empService.getEmployee(empId);
    }

    @PostMapping("/employees")

    public Employee addEmployee(@RequestBody Employee newEmp){
        LOG.info("in addEmployee");
        return empService.addEmployee(newEmp);

    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee editEmp){
        LOG.info("in updateEmployees");
        return empService.updateEmployee(editEmp);
    }

    @DeleteMapping("/employees/{eid}")
    public void removeEmployee(@PathVariable("eid") long empId){
        LOG.info("in removeEmployees");
        empService.deleteEmployee(empId);
    }

    @GetMapping("/employees/department/{did}")
    public List<EmployeeEntity> getAllEmployeesByDepartment(@PathVariable("did") long did){
        return empService.getAllEmployeesByDepartment(did);
    }



}
