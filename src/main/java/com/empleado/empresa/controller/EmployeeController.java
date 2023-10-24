package com.empleado.empresa.controller;

import com.empleado.empresa.entity.Employee;
import com.empleado.empresa.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/addEmployee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);

    }
    @GetMapping("/employees")
    public List<Employee> findAllEmployees(){
        return employeeService.getEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee findByID(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);

    }
    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Integer id){
        return employeeService.deleteEmployee(id);
    }



    @PostMapping("/addEmployees")
    public List<Employee> saveEmployees(@RequestBody List<Employee> employees){
        return employeeService.saveEmployee(employees);
    }
    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }
}
