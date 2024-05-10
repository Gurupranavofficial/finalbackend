package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    public final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @CrossOrigin
    @PostMapping
    public StudentEntity saveStudent(@RequestBody StudentEntity studentEntity){
        return studentService.saveStudent(studentEntity);
    }

    @CrossOrigin
    @GetMapping
    public List<StudentEntity> getAllStudents() {
        return studentService.getAllStudents();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public StudentEntity getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id).orElse(null);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public StudentEntity updateStudent(@PathVariable Long id, @RequestBody StudentEntity studentEntity) {
        return studentService.updateStudent(id, studentEntity);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "Student with ID " + id + " deleted successfully.";
    }
}