/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.sanpham;

/**
 *
 * @author admin
 */
public class SanPham {
    private static int dem = 0; 
    private int iD = dem++; 
    private String moTa; 
    private String ten; 
    private String nhaSX; 
    private double giaSP; 

    public SanPham() {
    }

    
    public SanPham(String moTa, String ten, String nhaSX, double giaSP) {
        this.moTa = moTa;
        this.ten = ten;
        this.nhaSX = nhaSX;
        this.giaSP = giaSP;
    }
    
    
    
    public void hienThi() {
        System.out.printf("Ma san pham: %d\n", this.iD); 
        System.out.printf("Ten san pham: %s\n", this.ten);
        System.out.printf("Mo ta sp: %s\n", this.moTa); 
        System.out.printf("Nha san xuat: %s\n", this.nhaSX); 
        System.out.printf("Gia san pham: %.1f\n", this.giaSP); 
    }
    
    public void nhap() {
        System.out.print("Nhap ten sp: ");
        this.ten = CauHinh.sc.nextLine(); 
        System.out.print("Nhap mo ta: "); 
        this.moTa = CauHinh.sc.nextLine(); 
         System.out.print("Nhap gia sp: "); 
        this.giaSP = Double.parseDouble(CauHinh.sc.nextLine()); 
         System.out.print("Nhap nha sx: "); 
        this.nhaSX = CauHinh.sc.nextLine(); 
        
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
     * @return the iD
     */
    public int getiD() {
        return iD;
    }

    /**
     * @param iD the iD to set
     */
    public void setiD(int iD) {
        this.iD = iD;
    }

    /**
     * @return the moTa
     */
    public String getMoTa() {
        return moTa;
    }

    /**
     * @param moTa the moTa to set
     */
    public void setMoTa(String moTa) {
        this.moTa = moTa;
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
     * @return the nhaSX
     */
    public String getNhaSX() {
        return nhaSX;
    }

    /**
     * @param nhaSX the nhaSX to set
     */
    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    /**
     * @return the giaSP
     */
    public double getGiaSP() {
        return giaSP;
    }

    /**
     * @param giaSP the giaSP to set
     */
    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }
}
