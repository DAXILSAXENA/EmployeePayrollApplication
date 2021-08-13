package com.bridgelabz.employeepayrollserviceapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class EmployeePayrollServiceApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EmployeePayrollServiceApplication.class, args);
        log.info("Employee Payroll Application Started in {} Environment",
                context.getEnvironment().getProperty("environment"));
    }

}
