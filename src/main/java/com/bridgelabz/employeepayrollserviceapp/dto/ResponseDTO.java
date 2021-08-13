/**
 * ResponseDTO.java
 */
package com.bridgelabz.employeepayrollserviceapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

// Lombok Annotations to automatically build getters,setters and constructors at source level
@Data
@AllArgsConstructor
public class ResponseDTO {
    private String message;
    private Object data;
}
