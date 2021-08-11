/** IEmployeePayrollService.java */
package com.bridgelabz.employeepayrollserviceapp.service;

import java.util.List;

import com.bridgelabz.employeepayrollserviceapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollserviceapp.model.EmployeePayrollData;

public interface IEmployeePayrollService {

	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

	EmployeePayrollData getEmployeePayrollDataById(int empId);

	EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO);

	List<EmployeePayrollData> getEmployeePayrollData();

	void deleteEmployeePayrollData(int empId);

}
