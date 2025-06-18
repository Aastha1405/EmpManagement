package com.aasthaproject.employeemanagement.EmpManagement.controller;

import com.aasthaproject.employeemanagement.EmpManagement.entity.Entity;
import com.aasthaproject.employeemanagement.EmpManagement.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("/all")
    public List<Entity> getAllEmpController(){
       return getAllEmpDetail();

    }
}
