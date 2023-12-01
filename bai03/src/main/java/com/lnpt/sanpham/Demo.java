/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.sanpham;

import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author admin
 */
public class Demo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        SanPham s1 = new Sach(100, "sinhvien", "oop", "dt", 2000);
        SanPham s2 = new BangDia(100, "HocSinh", "java", "sgon", 3000);      
        DsSanPham ds = new DsSanPham();        
        ds.themSp(s1, s2);
        ds.themSp("com.lnpt.sanpham.Sach");
        ds.themSp("com.lnpt.sanpham.BangDia");
        ds.hienThi();        
    }
    
}
