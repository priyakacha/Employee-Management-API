package com.example.Employee.Management.API.controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @GetMapping
    public List<String> getEmployees() {
        return List.of("Sasuke", "Naruto", "Sakura");
    }
}
