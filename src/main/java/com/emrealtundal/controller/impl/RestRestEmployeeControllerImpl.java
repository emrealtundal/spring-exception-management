package com.emrealtundal.controller.impl;

import com.emrealtundal.controller.RestEmployeeController;
import com.emrealtundal.dto.DtoEmployee;
import com.emrealtundal.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/api/employee")
public class RestRestEmployeeControllerImpl implements RestEmployeeController {

    @Autowired
    IEmployeeService employeeService;

    @GetMapping("/list/{id}")
    @Override
    public DtoEmployee findEmployeeById(@PathVariable Long id) {
        return employeeService.findEmployeeById(id);
    }
}
