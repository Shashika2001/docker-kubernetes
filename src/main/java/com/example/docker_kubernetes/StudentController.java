package com.example.docker_kubernetes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentRepo repo;

    @PostMapping
    public Student save(@RequestBody Student s) {
        return repo.save(s);
    }

    @GetMapping
    public List<Student> all() {
        return repo.findAll();
    }
}
