/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.BTH22;

/**
 *
 * @author admin
 */
public class HinhChuNhat extends Hinh{
    private double chieuDai; 
    private double chieuRong; 

    public HinhChuNhat(double chieuDai, double chieuRong, String ten) {
        super(ten);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    
  
    /**
     * @return the chieuDai
     */
    public double getChieuDai() {
        return chieuDai;
    }

    /**
     * @param chieuDai the chieuDai to set
     */
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    /**
     * @return the chieuRong
     */
    public double getChieuRong() {
        return chieuRong;
    }

    /**
     * @param chieuRong the chieuRong to set
     */
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich() {
        return this.chieuDai*this.chieuRong;
    }

    @Override
    public double tinhChuVi() {
        return this.chieuDai + this.chieuRong; 
    }
    
    
    
   
    
    
    
    
    
    
}
