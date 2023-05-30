package com.example.lab4_20180252_ws;

import com.example.lab4_20180252_ws.Entities.Employees;
import com.example.lab4_20180252_ws.Entities.Jobs;
import com.example.lab4_20180252_ws.Entities.Departments;
import com.example.lab4_20180252_ws.Repositories.DepartmentsRepository;
import com.example.lab4_20180252_ws.Repositories.EmployeesRepository;
import com.example.lab4_20180252_ws.Repositories.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class Controller {
    @Autowired
    EmployeesRepository employeesRepository;


    @Autowired
    JobsRepository jobsRepository;


    @Autowired
    DepartmentsRepository departmentsRepository;




    @GetMapping("tutor/list")
    public List<Employees> listarCargos() {
        return employeesRepository.findAllByJobIdNot("AD_PRES");
    }



    @GetMapping("tutor/job")
    public ResponseEntity<HashMap<String,Object>> obtenerJob(@RequestParam("id") String id){
        HashMap<String,Object> hashMap = new HashMap<>();
        try {
            Optional<Jobs> byId = jobsRepository.findById(id);
            if (byId.isPresent()) {
                hashMap.put("job",byId.get());
            } else {
                hashMap.put("msg","NA");
            }
            return ResponseEntity.ok(hashMap);
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(hashMap);
        }
    }

    @GetMapping("tutor/infoEmployee")
    public ResponseEntity<HashMap<String,Object>> obtenerEmployee(@RequestParam("id") Integer id){
        HashMap<String,Object> hashMap = new HashMap<>();
        try {
            Optional<Employees> byId = employeesRepository.findById(id);
            if (byId.isPresent()) {
                hashMap.put("employee",byId.get());
            } else {
                hashMap.put("msg","NA");
            }
            return ResponseEntity.ok(hashMap);
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(hashMap);
        }
    }


    @GetMapping("tutor/department")
    public ResponseEntity<HashMap<String,Object>> obtenerDepartment(@RequestParam("id") Integer id){
        HashMap<String,Object> hashMap = new HashMap<>();
        try {
            Optional<Departments> byId = departmentsRepository.findById(id);
            if (byId.isPresent()) {
                hashMap.put("depa",byId.get());
            } else {
                hashMap.put("msg","NA");
            }
            return ResponseEntity.ok(hashMap);
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(hashMap);
        }
    }



    @GetMapping("tutor/infoTutor")
    public ResponseEntity<HashMap<String,Object>> obtenerTutor(@RequestParam("id") Integer id){
        HashMap<String,Object> hashMap = new HashMap<>();
        try {
            Optional<Employees> byId = employeesRepository.findById(id);
            if (byId.isPresent()) {
                hashMap.put("employee",byId.get());
            } else {
                hashMap.put("msg","NA");
            }
            return ResponseEntity.ok(hashMap);
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(hashMap);
        }
    }



}