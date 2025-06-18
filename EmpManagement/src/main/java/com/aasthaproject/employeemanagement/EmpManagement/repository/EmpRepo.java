package com.aasthaproject.employeemanagement.EmpManagement.repository;

import com.aasthaproject.employeemanagement.EmpManagement.entity.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Entity,Integer> {
}
