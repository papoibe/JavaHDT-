/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.quanly;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class HocVien {
    
    private static int dem;
    private int id = ++dem;
    private String ten;
    private LocalDate ngaySinh;
    private double[] diem;

    public HocVien() {
    }
    

    public HocVien(String ten, LocalDate ngaySinh){
        this.ten = ten;
        this.ngaySinh = ngaySinh;
    }

    public HocVien(String ten, String ns) {
        this(ten, LocalDate.parse(ns, DateTimeFormatter.ofPattern(CauHinh.DATE_PATTERN)));
    }
    
    public void nhap1Hv(){
        System.out.println("Ho ten: ");
        this.ten = CauHinh.sc.nextLine();
        System.out.println("Ngay sinh: ");
        String ns = CauHinh.sc.nextLine();
        this.ngaySinh = LocalDate.parse(ns, DateTimeFormatter.ofPattern(CauHinh.DATE_PATTERN));
        
    }
    
    public void hienThi(){
        System.out.printf("Ma hoc vien: %d\n", this.id);
        System.out.printf("Ho ten: %s\n", this.ten);
        System.out.printf("Ngay sinh: %s\n", this.ngaySinh.format(DateTimeFormatter.ofPattern(CauHinh.DATE_PATTERN)));
    }
    
    public void nhapDiem1Hv() {
        this.diem = new double[CauHinh.SO_MON];
        for(int i =0; i < CauHinh.SO_MON; i++) {
            
        }
    }
    
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
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
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
     * @return the diem
     */
    public double[] getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double[] diem) {
        this.diem = diem;
    }
    
        
    
}