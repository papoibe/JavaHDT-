/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.TTTH;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author admin
 */
public abstract class GiangVien {

    private String hoTen;
    private LocalDate ngaySinh;
    private String hocHam;
    private String hocVi;
    private LocalDate ngayBatDau;

    public GiangVien(String hoTen, LocalDate ngaySinh, String hocHam, String hocVi, LocalDate ngayBatDau) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.ngayBatDau = ngayBatDau;
    }

    public abstract double tinhTienLuong(double soGio);

    @Override
    public String toString() {
        return String.format("ho ten: %s\n ngay sinh: %s\n hoc ham: %s \n hoc vi: %s\n ngay bat dau:", this.getHoTen(), this.getNgaySinh().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), this.getHocHam(), this.getHocVi(), this.getNgayBatDau().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the hocHam
     */
    public String getHocHam() {
        return hocHam;
    }

    /**
     * @param hocHam the hocHam to set
     */
    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    /**
     * @return the hocVi
     */
    public String getHocVi() {
        return hocVi;
    }

    /**
     * @param hocVi the hocVi to set
     */
    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    /**
     * @return the ngayBatDau
     */
    public LocalDate getNgayBatDau() {
        return ngayBatDau;
    }

    /**
     * @param ngayBatDau the ngayBatDau to set
     */
    public void setNgayBatDau(LocalDate ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

}
