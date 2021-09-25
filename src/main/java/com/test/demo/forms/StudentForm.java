/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.demo.forms;

import com.test.demo.pojo.Student;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.BeanUtils;

/**
 *
 * @author wuweicheng
 */
@Data
public class StudentForm {
    
    @NotBlank
    @Length(max = 10)
    private String name;
    @NotBlank
    @Length(max = 10)
    private String classroom;
    
    
    public Student convertToStudent(){
        Student student = new StudentFormConvert().converFor(this);
        return student;
    }
    
    
    private static class StudentFormConvert implements IFormConvert<StudentForm, Student>{

        @Override
        public Student converFor(StudentForm s) {
            Student student = new Student();
            BeanUtils.copyProperties(s, student);
            return student;
        }
        
    }
}
