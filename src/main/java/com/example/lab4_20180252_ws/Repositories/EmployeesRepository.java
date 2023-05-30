package com.example.lab4_20180252_ws.Repositories;

import com.example.lab4_20180252_ws.Entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeesRepository extends JpaRepository<Employees, Integer> {


    List<Employees> findAllByJobIdNot(String jobs);
}