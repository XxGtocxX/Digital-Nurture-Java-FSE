package com.debanuj.employeeservice.service;

import com.debanuj.employeeservice.dao.EmployeeDao;
import com.debanuj.employeeservice.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public ArrayList<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }
}