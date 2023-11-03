/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth02oop;

/**
 *
 * @author admin
 */
public class Demo {
    public static void main(String[] args) {
        Diem d1 = new Diem(5,9);
        Diem d2 = new Diem(9,15); 
        d1.HienThi();
        d2.HienThi();
        
        double kc = d1.tinhKhoangCach(d2);
        System.out.printf("Khoang cach = %.1f\n", kc);
        
        
        Diem d3 = new Diem(7,15);
        Diem d4 = new Diem(-7, -9);
        DoanThang dt1 = new DoanThang(d1,d2); 
        DoanThang dt2 = new DoanThang(d3,d4); 
        
        System.out.printf("Do dai 1: %.1f\n", dt1.tinhDoDai()); 
        System.out.printf("Do dai 2: %.1f\n", dt2.tinhDoDai()); 
        
        
        dt1.tinhTrungDiem().HienThi();
        
        DoanThang dt11 = new DoanThang(new Diem(1,0), new Diem(0,1)); 
        DoanThang dt22 = new DoanThang(new Diem(2,0), new Diem(0,2)); 
        
   
        System.out.println(dt11.isSongSong(dt22)); 

        

        
        
    }
    
}
