package com.bugrasert.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bugrasert.controller.RestEmployeeController;
import com.bugrasert.dto.DtoEmployee;
import com.bugrasert.model.RootEntitiy;
import com.bugrasert.service.impl.EmployeeServiceImpl;


@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements RestEmployeeController{
	
	@Autowired
	private EmployeeServiceImpl employeeService;

	
	@GetMapping("/list/{id}")
	@Override
	public RootEntitiy<DtoEmployee> findEmployeeById(@PathVariable(value = "id")  Long id) {
		return ok(employeeService.findEmployeeById(id));
	}

}
