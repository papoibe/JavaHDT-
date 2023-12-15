/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.taikhoan;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class TaiKhoan {

    private static int dem;
    private String soTK;
    private String tenTK;
    protected double soTien;

    {
        soTK = String.format("%06d", ++dem);
    }

    public TaiKhoan(String tenTK, double soTien) {
        this.tenTK = tenTK;
        this.soTien = soTien;
    }

    public void hienThi() {
        System.out.printf("So tk: %s\nTen tk: %s\nSo tien: %.1f\n", this.soTK, this.tenTK, this.soTien);
    }

    public void rutTien(double st) {
        if (this.isDaoHan() && st >= this.soTien) {
            this.soTien -= st;
        }
    }

    public void nopTien(double st) {
        if (this.isDaoHan()) {
            this.soTien += st;
        }
    }

    public boolean isDaoHan() {
        return true; 
    }
    
    public double tinhLai() {
        return (this.soTien * 0.00001)/12; 
    }
    
    
    

//    public void napTien(double soTienNap) {
//        this.soTien += soTienNap;
//    }
//    
//    public void rutTien(double soTienRut) {
//        
//    }
    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the soTK
     */
    public String getSoTK() {
        return soTK;
    }

    /**
     * @param soTK the soTK to set
     */
    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    /**
     * @return the tenTK
     */
    public String getTenTK() {
        return tenTK;
    }

    /**
     * @param tenTK the tenTK to set
     */
    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    /**
     * @return the soTien
     */
    public double getSoTien() {
        return soTien;
    }

    /**
     * @param soTien the soTien to set
     */
    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

}
