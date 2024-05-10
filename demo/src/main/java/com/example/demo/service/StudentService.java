package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.StudentEntity;

public interface StudentService {
    StudentEntity saveStudent(StudentEntity studentEntity);
    List<StudentEntity> getAllStudents();
    Optional<StudentEntity> getStudentById(Long id);
    StudentEntity updateStudent(Long id, StudentEntity studentEntity);
    void deleteStudent(Long id);

}
