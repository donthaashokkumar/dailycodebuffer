package com.dailycodebuffer.dailycode.repository;

import com.dailycodebuffer.dailycode.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
