package com.example.demo.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceimpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceimpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @SuppressWarnings("null")
    @Override
    public StudentEntity saveStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }
   @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

    @SuppressWarnings("null")
    @Override
    public Optional<StudentEntity> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @SuppressWarnings("null")
    @Override
    public StudentEntity updateStudent(Long id, StudentEntity studentEntity) {
        if (studentRepository.existsById(id)) {
            studentEntity.setId(id);
            return studentRepository.save(studentEntity);
        }
        return null; // Handle the case where student with the given id does not exist
    }

    @SuppressWarnings("null")
    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

}
