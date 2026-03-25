package com.emrealtundal.controller;

import com.emrealtundal.dto.DtoEmployee;

public interface RestEmployeeController {

    public DtoEmployee findEmployeeById(Long id);
}
