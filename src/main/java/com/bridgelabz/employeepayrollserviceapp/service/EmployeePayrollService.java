/**
 * EmployeePayrollService.java
 */
package com.bridgelabz.employeepayrollserviceapp.service;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.employeepayrollserviceapp.exception.EmployeePayrollException;
import com.bridgelabz.employeepayrollserviceapp.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollserviceapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollserviceapp.model.EmployeePayrollData;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Autowired
    private EmployeePayrollRepository employeePayrollRepository;

    private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();

    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = new EmployeePayrollData(employeePayrollDTO);
        employeePayrollList.add(employeePayrollData);
        return employeePayrollRepository.save(employeePayrollData);
    }

    @Override
    public List<EmployeePayrollData> getEmployeesByDepartment(String department) {
        return employeePayrollRepository.findEmployeePayrollDataByDepartments(department);
    }

    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        // Throwing custom exception when employee Id does match any employee Id stored in list
        return employeePayrollRepository.findById(empId).orElseThrow(() -> new EmployeePayrollException("Employee not Found"));
    }

    public EmployeePayrollData updateEmployeePayrollData(int empID, EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empID);
        employeePayrollData.updateEmployeePayrollData(employeePayrollDTO);
        return employeePayrollRepository.save(employeePayrollData);
    }

    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollRepository.findAll();
    }

    public void deleteEmployeePayrollData(int empId) {
        EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empId);
        employeePayrollRepository.delete(employeePayrollData);

    }

}
