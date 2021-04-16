package com.example.springboot2jpacrud.controller;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;


import com.example.springboot2jpacrud.model.Employee;
import com.example.springboot2jpacrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.springboot2jpacrud.exception.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
        throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
          return ResponseEntity.ok().body(employee);
    }

    @PostMapping("/employees")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeId,
           @Valid @RequestBody Employee employeDetails) throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeId)
        .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id:: " + employeId));

        employee.setEmailId(employeDetails.getEmailId());
        employee.setLastName(employeDetails.getLastName());
        employee.setEmailId(employeDetails.getEmailId());
        final Employee updateEmployee = employeeRepository.save(employee);
        return ResponseEntity.ok(updateEmployee);
    }

    @DeleteMapping("/employee/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
        throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
        .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id::"+ employeeId));

        employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
