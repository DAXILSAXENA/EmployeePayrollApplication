/** EmployeePayrollData.java */
package com.bridgelabz.employeepayrollserviceapp.model;

import com.bridgelabz.employeepayrollserviceapp.dto.EmployeePayrollDTO;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class EmployeePayrollData {

	private int employeeId;
	private String name;
	private long salary;
	public String gender;
	public String note;
	public LocalDate createdDate;
	public String profilePic;
	public List<String> departments;

	public EmployeePayrollData() {} 

	public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
		this.employeeId = empId;
		this.createdDate = LocalDate.now();
		this.updateEmployeePayrollData(employeePayrollDTO);
	}

	public void updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		this.name = employeePayrollDTO.name;
		this.salary = employeePayrollDTO.salary;
		this.gender = employeePayrollDTO.gender;
		this.note = employeePayrollDTO.note;
		this.profilePic = employeePayrollDTO.profilePic;
		this.departments = employeePayrollDTO.departments;
	}

}
