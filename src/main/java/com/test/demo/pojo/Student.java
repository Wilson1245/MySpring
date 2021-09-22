/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

/**
 *
 * @author Administrator
 */
@Data
@Entity(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String name;

    private String classroom;
    
    @ColumnDefault(value = "0")
    private int chineseScore;
    
    @ColumnDefault(value = "0")
    private int mathScore;
    
    @ColumnDefault(value = "0")
    private int englishScore;
}
