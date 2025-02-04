package com.bugrasert.service;

import com.bugrasert.dto.DtoEmployee;


public interface IEmployeeService {
	
	public DtoEmployee findEmployeeById(Long id);

}
