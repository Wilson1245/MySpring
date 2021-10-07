/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.secondary.demo2.pojo;

import lombok.Data;

/**
 *
 * @author wuweicheng
 */
@Data /* setting, getting, toString */
public class Student {
    private int id;
    private String name;
    private String classroom;
    private int chinese;
    private int math;
    private int english;
}
