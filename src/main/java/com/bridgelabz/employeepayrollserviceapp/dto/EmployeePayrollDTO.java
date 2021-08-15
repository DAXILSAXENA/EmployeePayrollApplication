/** EmployeePayrollDTO.java */
package com.bridgelabz.employeepayrollserviceapp.dto;

import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

@ToString
public class EmployeePayrollDTO {

	// @NotEmpty annotation to validate that user don't pass an empty value
	// @Pattern annotation used to validate user input using regexp
	@NotEmpty
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee Name INVALID")
	public String name;

	// @Min annotation to specify minimum Salary
	@Min(value = 500, message = "Min Wage should be more than 500")
	public long salary;

	public String gender;

	public String note;

	public String profilePic;

	public List<String> departments;
}