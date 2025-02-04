package com.bugrasert.controller;

import com.bugrasert.dto.DtoEmployee;
import com.bugrasert.model.RootEntitiy;

public interface RestEmployeeController {
	
	public RootEntitiy<DtoEmployee> findEmployeeById(Long id);

}
