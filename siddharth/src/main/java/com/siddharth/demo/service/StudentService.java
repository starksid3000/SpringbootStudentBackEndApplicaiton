package com.siddharth.demo.service;

import com.siddharth.demo.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
