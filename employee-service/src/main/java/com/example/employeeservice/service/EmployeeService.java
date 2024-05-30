package com.example.employeeservice.service;

import com.example.employeeservice.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee createEmployee(Employee employee);

    void deleteEmployee(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
