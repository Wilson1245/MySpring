/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.demo.controller;

import com.test.demo.forms.StudentForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.test.demo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import  com.test.demo.pojo.Student;
import com.test.demo.repository.StudentRepository;
import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
        List<Student> students = studentService.findAllSort();
        model.addAttribute("student", students);
        return "showAll";
    }
    
    @GetMapping("/addStudent")
    public String addStudent(Model model){
        model.addAttribute("StudentForm", new StudentForm());
        return "AddStudent";
    }
    
    @PostMapping("/createStudent")
    public String createStudent(@ModelAttribute("StudentForm") @Valid StudentForm studentForm, BindingResult result){
        if(result.hasErrors()){
            return "AddStudent";
        }
        if(studentService.checkName(studentForm.getName()) == null){
            Student student = studentForm.convertToStudent();
            studentService.save(student);
        }
        return "redirect:/find";
    }
    
    @GetMapping("/editStudent/{id}")
    public String editStudent (@PathVariable int id,Model model){
        Student student = studentService.findById(id).get();
        model.addAttribute("Student", student);
        return "EditStudent";
    }
    
    @PostMapping("/editStudentSave")
    public String editStudentSave(@ModelAttribute("Student")Student student){
        System.out.println("Student : " + student);
        if(student.getChineseScore() > 100 || student.getMathScore() > 100 || student.getEnglishScore() > 100 || student.getChineseScore() < 0 || student.getMathScore() < 0 || student.getEnglishScore() < 0){
            return "EditStudent";
        }
        studentService.save(student);
        return "redirect:/find";
    }
    
    @GetMapping("/del/{id}")
    public String deleteGet(@PathVariable int id){
        studentService.delete(id);
        return "redirect:/find";
    }
}
