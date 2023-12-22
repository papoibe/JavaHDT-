/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.BTH22;

/**
 *
 * @author admin
 */
public abstract class Hinh {
    private String ten; 

    public Hinh(String ten) {
        this.ten = ten;
    }
    
    
    public abstract double tinhDienTich(); 
    public abstract double tinhChuVi(); 

    @Override
    public String toString() {
        return String.format("%s\nDien tich: %.1f\nChu vi: %.1f\n", this.ten, this.tinhDienTich(), this.tinhChuVi());
    }

    @Override
    public boolean equals(Object obj) {
        Hinh h = (Hinh) obj; 
        return this.ten.equals(h.ten);
    }
    
    
    
    
    

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }
    
    
    
}
