package com.example.lab4_20180252_ws.Repositories;

import com.example.lab4_20180252_ws.Entities.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentsRepository extends JpaRepository<Departments, Integer> {
}