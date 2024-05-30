package com.example.employeeservice.service;

import com.example.employeeservice.model.Employee;
import com.example.employeeservice.model.mongo.EmployeeMongo;
import com.example.employeeservice.repository.EmployeeMongoRepository;
import com.example.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeMongoService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMongoRepository employeeMongoRepository;

    public void migrateData() {
        List<Employee> employees = employeeRepository.findAll();
        for (Employee employee : employees) {
            EmployeeMongo employeeMongo = new EmployeeMongo();
            employeeMongo.setFirstName(employee.getFirstName());
            employeeMongo.setLastName(employee.getLastName());
            employeeMongo.setDob(employee.getDob());
            employeeMongo.setSsn(employee.getSsn());
            employeeMongoRepository.save(employeeMongo);
        }
    }
}
