package com.example.Hp.Manager;

import java.util.ArrayList;
import java.util.List;



import org.springframework.stereotype.Service;

import com.example.Hp.Resource.Employee;
import com.example.Hp.Resource.Employees;

@Service

public class EmployeeManager {
    public Employees initializeEmployees() {
        Employees employees = new Employees();

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("ID001", "John", "Doe", "john.doe@email.com", "Manager"));
        employeeList.add(new Employee("ID002", "Jane", "Smith", "jane.smith@email.com", "Developer"));
        employeeList.add(new Employee("ID003", "Mike", "Johnson", "mike.johnson@email.com", "Analyst"));
        employeeList.add(new Employee("ID004", "Emily", "Brown", "emily.brown@email.com", "Designer"));

        employees.setEmployeeList(employeeList);
        return employees;
    }
}
