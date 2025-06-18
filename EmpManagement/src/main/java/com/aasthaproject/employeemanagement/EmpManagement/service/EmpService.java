package com.aasthaproject.employeemanagement.EmpManagement.service;

import com.aasthaproject.employeemanagement.EmpManagement.entity.Entity;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmpService {
    List<Entity> getAllEmpDetail();


}

