/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.demo.forms;

/**
 *
 * @author wuweicheng
 */
public interface IFormConvert<S, T> {
    T converFor (S s);
}
