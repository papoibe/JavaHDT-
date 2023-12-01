/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.sanpham;

/**
 *
 * @author admin
 */
public class BangDia extends SanPham {
    private int doDai; 

    public BangDia() {
    }
    

    
    
    public BangDia(int doDai, String moTa, String ten, String nhaSX, double giaSP) {
        super(moTa, ten, nhaSX, giaSP);
        this.doDai = doDai;
        
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("do dai: %.1f\n", this.doDai); 
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("do dai = "); 
        this.doDai = Integer.parseInt(CauHinh.sc.nextLine());

    }
    
    

    /**
     * @return the doDai
     */
    public int getDoDai() {
        return doDai;
    }

    /**
     * @param doDai the doDai to set
     */
    public void setDoDai(int doDai) {
        this.doDai = doDai;
    }
    

   
    
    
}
