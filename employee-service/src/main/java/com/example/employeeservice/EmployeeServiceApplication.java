package com.example.employeeservice;

import com.example.employeeservice.service.EmployeeMongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
public class EmployeeServiceApplication {

    @Autowired
    private EmployeeMongoService employeeMongoService;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceApplication.class, args);
    }

    // Method for one-time migration
    public void migrateDataOnce() {
        employeeMongoService.migrateData();
    }

    // Method for continuous migration (example: scheduled task)
    
    @Scheduled(fixedRate = 3600000) // Run every hour
    public void migrateDataContinuously() {
        employeeMongoService.migrateData();
    }
}
