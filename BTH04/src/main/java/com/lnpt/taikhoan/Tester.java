/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.taikhoan;

/**
 *
 * @author admin
 */
public class Tester {
    public static void main(String[] args) {
        TaiKhoan t1 = new TaiKhoan("Nguyen van a", 100);
        t1.nopTien(100);
        TaiKhoan t2 = new TaiKhoanKyHan("tran thi b", 1000, KyHan.MOT_TUAN);
        t2.nopTien(50);
        TaiKhoan t3 = new TaiKhoanKyHan("vo van tan", 2000, KyHan.MOT_TUAN);
        
        
        t1.hienThi();
        t2.hienThi();
        t3.hienThi();
        
                
    }
}
