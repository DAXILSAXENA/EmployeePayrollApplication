/** EmployeePayrollDTO.java */
package com.bridgelabz.employeepayrollserviceapp.dto;

import lombok.ToString;

import javax.validation.constraints.*;
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

	@Pattern(regexp = "male|female", message = "Gender needs to be male or female")
	public String gender;

	@NotBlank(message = "Note cannot be Empty")
	public String note;

	@NotBlank(message = "profilePic cannot be Empty")
	public String profilePic;

	@NotNull(message = "Department should Not be Null")
	public List<String> departments;
}