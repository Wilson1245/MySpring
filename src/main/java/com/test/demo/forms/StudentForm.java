/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.demo.forms;

import com.test.demo.pojo.Student;
import lombok.Data;
import org.springframework.beans.BeanUtils;

/**
 *
 * @author Administrator
 */
@Data
public class StudentForm {

    private String name;
    private String classroom;
    
    public Student convertToStudent(){
        Student student = new studentFromConvert().converFor(this);
        return student;
    }

    
    private static class studentFromConvert implements IFromConvert<StudentForm, Student> {

        @Override
        public Student converFor(StudentForm s) {
            Student student = new Student();
            BeanUtils.copyProperties(s, student);
            return student;
        }
    }

}
