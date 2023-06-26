package com.example._spring_demo4_hibernate.dao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example._spring_demo4_hibernate.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{
    public List<Employee> findAllByOrderByLastNameAsc();
}
