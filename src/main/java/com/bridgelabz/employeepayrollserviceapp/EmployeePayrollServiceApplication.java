package com.bridgelabz.employeepayrollserviceapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EmployeePayrollServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeePayrollServiceApplication.class, args);
        log.info("Employee Payroll App Started SuccessFully");
    }

}
