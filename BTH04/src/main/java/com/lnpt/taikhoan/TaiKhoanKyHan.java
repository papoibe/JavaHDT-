/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.lnpt.taikhoan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author admin
 */
public class TaiKhoanKyHan extends TaiKhoan {

    private LocalDate ngayDaoHan;
    private KyHan kyHan;

    public TaiKhoanKyHan(String tenTK, double soTien, KyHan kyHan) {
        super(tenTK, soTien);
        this.kyHan = kyHan;
        this.ngayDaoHan = LocalDate.now();
//        switch (kyHan) {
//            case MOT_TUAN -> this.ngayDaoHan = this.ngayDaoHan.plusDays(7);
//
//            case MOT_THANG -> this.ngayDaoHan = this.ngayDaoHan.plusMonths(1);
//        }
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("Ky han: %s\nNgay dao han: %s\n", this.kyHan, this.ngayDaoHan.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));
    }

    @Override
    public boolean isDaoHan() {
        return LocalDate.now().equals(this.ngayDaoHan);
    }

    @Override
    public double tinhLai() {
        return this.kyHan.tinhLai(this.soTien);
    }
    
    
    
    

    /**
     * @return the ngayDaoHan
     */
    public LocalDate getNgayDaoHan() {
        return ngayDaoHan;
    }

    /**
     * @param ngayDaoHan the ngayDaoHan to set
     */
    public void setNgayDaoHan(LocalDate ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }

    /**
     * @return the kyHan
     */
    public KyHan getKyHan() {
        return kyHan;
    }

    /**
     * @param kyHan the kyHan to set
     */
    public void setKyHan(KyHan kyHan) {
        this.kyHan = kyHan;
    }

}
