/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.demo.service;

import org.springframework.stereotype.Service;
import com.test.demo.pojo.Student;
/**
 *
 * @author Administrator
 */
@Service
public class StudentService {
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
}
