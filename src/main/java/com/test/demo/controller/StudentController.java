/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.test.demo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import  com.test.demo.pojo.Student;
import com.test.demo.repository.StudentRepository;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
/**
 *
 * @author Administrator
 */
//@RestController
@Controller
@RequestMapping("/")
public class StudentController {
    
    @Autowired
    StudentService studentService;
    
    @Autowired
    StudentRepository studentRepository;
    
    @GetMapping("/student")
    public String getStudent(Model model){
        Student student = studentService.createStudent();
        model.addAttribute("message", student);
        return "index";
    }
    
    @GetMapping("/find")
    public String showStudent(Model model){
        List<Student> students = studentRepository.findAll();
        model.addAttribute("student", students);
        return "showAll";
    }
}
