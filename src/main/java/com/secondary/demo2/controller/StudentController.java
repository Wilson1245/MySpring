/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.secondary.demo2.controller;

import com.secondary.demo2.pojo.Student;
import com.secondary.demo2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wuweicheng
 */
@RestController
@RequestMapping(produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
public class StudentController {
    
    @Autowired
    StudentService studentService;
    
    @GetMapping("/find")
    public Student find(){
        Student s = studentService.createStudent();
        return s;
    }
}
