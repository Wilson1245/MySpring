/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.demo.service;

import org.springframework.stereotype.Service;
import com.test.demo.pojo.Student;
import com.test.demo.repository.StudentRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Administrator
 */
@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    
    public Student createStudent(){
        Student student = new Student();
        student.setId(112233);
        student.setName("John");
        student.setClassroom("CLassA");
        student.setChineseScore(20);
        student.setEnglishScore(50);
        student.setMathScore(80);
        
        return student;
    }
    
    public void save(Student student){
        studentRepository.save(student);
    }
    
    public List<Student> findClassmate(String classroom){
        return studentRepository.findByClassroom(classroom);
    }
    
    public Student checkName(String name){
        return studentRepository.findByName(name);
    }
    
    public Optional<Student> findById(int id){
        return studentRepository.findById(id);
    }
}
