package com.example.demo1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Employee {
    private long empId;
    private String empName;
    private long deptId;
}
