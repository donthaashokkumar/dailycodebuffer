package com.dailycodebuffer.dailycode.service;

import com.dailycodebuffer.dailycode.entity.Department;

import java.util.List;
import java.util.Optional;


public interface DepartmentService
{

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Optional<Department> fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);
}
