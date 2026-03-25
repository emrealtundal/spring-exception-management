package com.emrealtundal.service.impl;

import com.emrealtundal.dto.DtoDepartment;
import com.emrealtundal.dto.DtoEmployee;
import com.emrealtundal.exception.BaseException;
import com.emrealtundal.exception.ErrorMessage;
import com.emrealtundal.exception.MessageType;
import com.emrealtundal.model.Department;
import com.emrealtundal.model.Employee;
import com.emrealtundal.repository.EmployeeRepository;
import com.emrealtundal.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public DtoEmployee findEmployeeById(Long id) {
        DtoEmployee dtoEmployee = new DtoEmployee();
        DtoDepartment dtoDepartment = new DtoDepartment();

        Optional<Employee> optional = employeeRepository.findById(id);

        if(optional.isEmpty()){
            throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, id.toString()));
        }
        Employee dbEmployee = optional.get();
        Department dbDepartment = dbEmployee.getDepartment();

        BeanUtils.copyProperties(dbEmployee, dtoEmployee);
        BeanUtils.copyProperties(dbDepartment, dtoDepartment);

        dtoEmployee.setDepartment(dtoDepartment);

        return dtoEmployee;
    }
}
