/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.demo.pojo;

import lombok.Data;

/**
 *
 * @author Administrator
 */
@Data
public class Student {

    private int id;
    
    private String name;

    private String classroom;
    
    private int chineseScore;
    
    private int mathScore;
    
    private int englishScore;
}
/* 

Springboot

Spring MVC
M : Model
V : View
C : Controller

            Repository(insert, delete, update) 
Model -->> Service -->> Controller --> Database --> View
*/