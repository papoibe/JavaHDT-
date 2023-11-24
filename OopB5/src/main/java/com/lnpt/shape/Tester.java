/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.shape;

/**
 *
 * @author admin
 */
public class Tester {
    public static void main(String[] args) throws Exception {
        Ellipse e1 = new Ellipse(45, 40);
        e1.hienThi();
        Ellipse e2 = new Circle(50); 
        e2.hienThi();
        
        
        TamGiac t1 = new TamGiacCan(45, 30);
        t1.hienThi();
        TamGiac t2 = new TamGiacDeu(55); 
        t2.hienThi();
        Object[] a = {e1, e2, t1, t2}; 
    }
}
