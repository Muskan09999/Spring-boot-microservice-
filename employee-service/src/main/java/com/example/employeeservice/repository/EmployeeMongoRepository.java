package com.example.employeeservice.repository;

import com.example.employeeservice.model.EmployeeMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeMongoRepository extends MongoRepository<EmployeeMongo, String> {
}
