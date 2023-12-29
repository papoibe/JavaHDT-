/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.TTTH;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class GvCoHuu extends GiangVien{
    
    private double luongCB;
    private float heSo; 

    public GvCoHuu(double luongCB, float heSo, String hoTen, LocalDate ngaySinh, String hocHam, String hocVi, LocalDate ngayBatDau) {
        super(hoTen, ngaySinh, hocHam, hocVi, ngayBatDau);
        this.luongCB = luongCB;
        this.heSo = heSo;
    }
    

    
    
    
    /**
     * @return the luongCB
     */
    public double getLuongCB() {
        return luongCB;
    }

    /**
     * @param luongCB the luongCB to set
     */
    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    /**
     * @return the heSo
     */
    public float getHeSo() {
        return heSo;
    }

    /**
     * @param heSo the heSo to set
     */
    public void setHeSo(float heSo) {
        this.heSo = heSo;
    }

    @Override
    public double tinhTienLuong(double soGio) {
        return soGio*90000 + luongCB*heSo; 
    }

    @Override
    public String toString() {
        return String.format("luong co ban %d\n he so: %1.f\n",this.luongCB, this.heSo);
    }
    
    
    
    
    
}
