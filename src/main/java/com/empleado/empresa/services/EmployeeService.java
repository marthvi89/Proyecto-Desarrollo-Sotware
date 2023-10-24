package com.empleado.empresa.services;

import com.empleado.empresa.entity.Employee;
import com.empleado.empresa.repository.EmployeeRepository;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
   private EmployeeRepository employeeRepository;

    public List<Employee> getEmployee(){
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
     public List<Employee> saveEmployee(List<Employee> employees){
        return employeeRepository.saveAll(employees);
     }

     public Employee getEmployeeById(Integer id){
        return employeeRepository.findById(id).orElse(null);
     }


     public Employee updateEmployee(Employee employee){
        Employee existingEmployee = employeeRepository.findById(employee.getId()).orElse(null);
        existingEmployee.setName(employee.getName());
        existingEmployee.setAge(employee.getAge());
        return employeeRepository.save(existingEmployee);
     }

     public String deleteEmployee(Integer id){
        employeeRepository.deleteById(id);
        return "has eliminado al estudiante con el ID " + id;
     }

// CRUD: ver empleado, añadir empleado,modificarlo,eliminarlo
}
