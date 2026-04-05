package com.emrealtundal.controller;

import com.emrealtundal.dto.DtoEmployee;
import com.emrealtundal.model.RootEntity;

public interface RestEmployeeController {

    public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
