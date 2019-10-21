package com.ichanskiy.luxoft.repository;

import com.ichanskiy.luxoft.entity.Employee;

public interface EmployeeRepositoryCustom {
    Employee getEmployeeByEmail(String email);
}
