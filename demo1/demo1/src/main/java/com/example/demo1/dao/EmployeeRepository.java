package com.example.demo1.dao;

import com.example.demo1.entity.EmployeeEntity;
import com.example.demo1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
    List<EmployeeEntity> findByDeptId(long deptId);
}
