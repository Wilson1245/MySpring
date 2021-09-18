/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.demo.pojo.Student;
import java.util.List;
/**
 *
 * @author Administrator
 */
public interface StudentRepository extends JpaRepository<Student, Integer>{
    public List<Student> findAllByClassroom(String classroom);
}
