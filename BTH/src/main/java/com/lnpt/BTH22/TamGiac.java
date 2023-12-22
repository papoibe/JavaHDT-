/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.BTH22;

/**
 *
 * @author admin
 */
public class TamGiac extends Hinh {
    private double a, b,c; 

    public TamGiac(double a, double b, double c, String ten) {
        super(ten);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double tinhDienTich() {
        double kq = this.tinhChuVi() / 2; 
        return Math.sqrt(kq * (kq - this.a) * (kq - this.b) * (kq - this.c)); 
    }

    @Override
    public double tinhChuVi() {
        return this.a + this.b + this.c; 
    }
    
    
    
}
