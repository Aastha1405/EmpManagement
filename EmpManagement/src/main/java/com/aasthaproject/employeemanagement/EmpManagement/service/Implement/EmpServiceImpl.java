package com.aasthaproject.employeemanagement.EmpManagement.service.Implement;

import com.aasthaproject.employeemanagement.EmpManagement.entity.Entity;
import com.aasthaproject.employeemanagement.EmpManagement.repository.EmpRepo;
import com.aasthaproject.employeemanagement.EmpManagement.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpRepo EmpRepo;
    public List<Entity> getAllEmpDetail() {
        return EmpRepo.findAll();
    }
}
