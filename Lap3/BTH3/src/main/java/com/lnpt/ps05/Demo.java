/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.ps05;

/**
 *
 * @author admin
 */
public class Demo {
   public static void main(String[] args) {
        PhanSo p1 = new PhanSo(-3,4);
        PhanSo p2 = new PhanSo(5,4);
        PhanSo p3 = new PhanSo(7,4);
        PhanSo p4 = new PhanSo(4,-9);
        PhanSo p5 = new PhanSo(-1,4);
        
        DsPhanSo ql = new DsPhanSo(); 
        ql.themPs(p1, p2, p3, p4, p5);
        ql.themPs();
        ql.themPs();
        ql.hienThi();
    
       
//        PhanSo[] a = {p1,p2,p3,p4,p5};
//        for (PhanSo x:a)
//            x.hienThi();
//        System.out.println();
//       
//        PhanSo tong = new PhanSo();
//       
//        for(PhanSo x : a)
//            tong = tong.cong(x);
//       
//        System.out.printf("Phan so tong = ");
//        tong.rutGon().hienThi();
//       
//        PhanSo max = a[0];
//        for(int i=1;i<a.length;i++)
//            if(max.soSanh(a[i]) < 0)
//                max = a[i];
//        System.out.printf("\nPhan so max = ");
//        max.hienThi();
    }
}
