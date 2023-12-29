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
public class GvThinhGiang extends GiangVien {

    private String noiCongTac; 

    public GvThinhGiang(String noiCongTac, String hoTen, LocalDate ngaySinh, String hocHam, String hocVi, LocalDate ngayBatDau) {
        super(hoTen, ngaySinh, hocHam, hocVi, ngayBatDau);
        this.noiCongTac = noiCongTac;
    }

    @Override
    public String toString() {
        return String("noi cong tac: %s\n");
    }
    
    
    
    @Override
    public double tinhTienLuong(double soGio) {
        return soGio*90000; 
    }

    /**
     * @return the noiCongTac
     */
    public String getNoiCongTac() {
        return noiCongTac;
    }

    /**
     * @param noiCongTac the noiCongTac to set
     */
    public void setNoiCongTac(String noiCongTac) {
        this.noiCongTac = noiCongTac;
    }

    private String String(String noi_cong_tac_s) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
