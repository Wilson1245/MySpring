/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.secondary.demo2.service;

import com.secondary.demo2.pojo.Student;
import org.springframework.stereotype.Service;

/**
 *
 * @author wuweicheng
 */
@Service
public class StudentService {
    public Student createStudent(){
        Student student = new Student();
        student.setId(112233);
        student.setName("John");
        student.setClassroom("R3-1");
        student.setChinese(60);
        student.setMath(22);
        student.setEnglish(50);
        return student;
    }
}
