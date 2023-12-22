/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.BTH22;

/**
 *
 * @author admin
 */
public class Tester {
    
    public static void main(String[] args) {
        QLHinh ql = new QLHinh();
        Hinh h1 = new HinhVuong(1.6, "Vuong");
        Hinh h2 = new HinhChuNhat(2.3, 1.4, "chu nhat"); 
        Hinh h3 = new TamGiacDeu(6.1, "Deu");
        
        ql.themHinh(h1, h2, h3);
        ql.hienThi();
        System.out.println(ql.timHinh(new HinhChuNhat(2.3, 1.4, "chu nhat")));
        
    }
    
}
