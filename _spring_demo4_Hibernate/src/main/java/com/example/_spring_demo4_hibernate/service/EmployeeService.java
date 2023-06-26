package com.example._spring_demo4_hibernate.service;

import com.example._spring_demo4_hibernate.entity.Employee;


import java.util.List;
public interface EmployeeService {
  public List<Employee> findAll();
  public Employee findById(int theId);
  public void save (Employee theEmployee);
  public void deleteById(int Id);
}
