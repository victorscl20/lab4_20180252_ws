package com.example.lab4_20180252_ws.Repositories;

import com.example.lab4_20180252_ws.Entities.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsRepository extends JpaRepository<Jobs, String> {
}