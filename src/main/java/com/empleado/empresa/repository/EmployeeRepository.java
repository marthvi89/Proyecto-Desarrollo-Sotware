package com.empleado.empresa.repository;

import com.empleado.empresa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee,Integer> {


}
