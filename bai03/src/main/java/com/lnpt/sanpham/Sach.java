/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.sanpham;

/**
 *
 * @author admin
 */
public class Sach extends SanPham {
    private int soTrang; 

    public Sach() {
    }
    
    

    public Sach(int soTrang, String moTa, String ten, String nhaSX, double giaSP) {
        super(moTa, ten, nhaSX, giaSP);
        this.soTrang = soTrang;
    }

    

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("So trang: %s\n", this.soTrang); 
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap so trang = ");
        this.soTrang = Integer.parseInt(CauHinh.sc.nextLine()); 
    }
    
    
   

    /**
     * @return the soTrang
     */
    public int getSoTrang() {
        return soTrang;
    }

    /**
     * @param soTrang the soTrang to set
     */
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
    
    
}
