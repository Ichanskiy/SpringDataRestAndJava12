package com.ichanskiy.luxoft.repository;

import com.ichanskiy.luxoft.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

import static com.ichanskiy.luxoft.controllers.ControllerAPI.DEPARTMENT_CONTROLLER;

@CrossOrigin
@RestResource(path = DEPARTMENT_CONTROLLER, rel = DEPARTMENT_CONTROLLER)
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    
    List<Department> findAllByOrderByIdAsc();

    @RestResource(path = "findAll", rel = "findAll")
    List<Department> findAll();
}
