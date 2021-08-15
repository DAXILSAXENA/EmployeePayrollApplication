package com.bridgelabz.employeepayrollserviceapp.repository;

import com.bridgelabz.employeepayrollserviceapp.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData,Integer> {
}
