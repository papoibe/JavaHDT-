/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.quanly;

import java.io.FileNotFoundException;
import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        HocVien h1 = new HocVien("THINH", LocalDate.of(2004, 11, 25));
        HocVien h2 = new HocVien("V", LocalDate.of(2004, 11, 17));
        HocVien h3 = new HocVien("C", "15/07/1999");
        
        
        QuanLyHocVien ql = new QuanLyHocVien();
        ql.themHv(h1,h2, h3);
        ql.docDsHv(); 
//        ql.themHv();
        ql.hienThi();
        
        
    }
}

