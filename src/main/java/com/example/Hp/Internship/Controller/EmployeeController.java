package com.example.Hp.Internship.Controller;

import com.example.Hp.Manager.EmployeeManager;
import com.example.Hp.Resource.Employee;
import com.example.Hp.Resource.Employees;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeManager employeeManager;

    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @GetMapping
    public Employees getAllEmployees() {
        return employeeManager.initializeEmployees();
    }
    @PostMapping
    public Employees addEmployee(@RequestBody Employee newEmployee) {
        Employees employees = employeeManager.initializeEmployees();
        employees.getEmployeeList().add(newEmployee);
        return employees;
    }
}
