/** EmployeePayrollData.java */
package com.bridgelabz.employeepayrollserviceapp.model;

import com.bridgelabz.employeepayrollserviceapp.dto.EmployeePayrollDTO;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "employee_payroll")
@Data
public class EmployeePayrollData {

	// @Id annotation to make employeeId as primary key
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private int employeeId;
	private String name;
	private long salary;
	private String gender;
	private String note;
	private LocalDate createdDate;
	private String profilePic;

	@ElementCollection
	@CollectionTable(name = "employee_department",joinColumns = @JoinColumn(name = "id"))
	@Column(name = "department")
	private List<String> departments;

	public EmployeePayrollData() {} 

	public EmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
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
