/**
 * EmployeePayrollService.java
 */
package com.bridgelabz.employeepayrollserviceapp.service;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.employeepayrollserviceapp.exception.EmployeePayrollException;
import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollserviceapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollserviceapp.model.EmployeePayrollData;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();

    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = new EmployeePayrollData(employeePayrollList.size() + 1,
                employeePayrollDTO);
        employeePayrollList.add(employeePayrollData);
        return employeePayrollData;
    }

    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        // Throwing custom exception when employee Id does match any employee Id stored in list
        return employeePayrollList.stream().filter(empData -> empData.getEmployeeId() == empId).findFirst().orElseThrow(() -> new EmployeePayrollException("Employee not Found"));
    }

    public EmployeePayrollData updateEmployeePayrollData(int empID, EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empID);
        employeePayrollData.setName(employeePayrollDTO.name);
        employeePayrollData.setSalary(employeePayrollDTO.salary);
        employeePayrollList.set(empID - 1, employeePayrollData);
        return employeePayrollData;
    }

    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollList;
    }

    public void deleteEmployeePayrollData(int empId) {
        employeePayrollList.remove(empId - 1);

    }

}
