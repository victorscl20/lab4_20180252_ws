package com.example.lab4_20180252_ws.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
public class Employees {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "employee_id")
    private int employeeId;
    @Basic
    @Column(name = "first_name")
    private String firstName;
    @Basic
    @Column(name = "last_name")
    private String lastName;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "phone_number")
    private String phoneNumber;
    @Basic
    @Column(name = "hire_date")
    private Timestamp hireDate;
    @Basic
    @Column(name = "job_id")
    private String jobId;
    @Basic
    @Column(name = "salary")
    private BigDecimal salary;
    @Basic
    @Column(name = "commission_pct")
    private BigDecimal commissionPct;
    @Basic
    @Column(name = "manager_id")
    private Integer managerId;
    @Basic
    @Column(name = "department_id")
    private Integer departmentId;
    @Basic
    @Column(name = "meeting")
    private byte meeting;
    @Basic
    @Column(name = "meeting_date")
    private Timestamp meetingDate;
}
