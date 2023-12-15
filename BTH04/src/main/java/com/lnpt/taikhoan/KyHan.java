/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.lnpt.taikhoan;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public enum KyHan {
    MOT_TUAN(7, 0.5) {
        @Override
        public LocalDate tinhDaoHan(LocalDate d) {
            return d.plusDays(7);
        }

        @Override
        public double tinhLai(double st) {
            return (st * this.laiSuat)/100/12/4; 
        }
    },
    MOT_THANG(1, 4.5) {
        @Override
        public LocalDate tinhDaoHan(LocalDate d) {
            return d.plusMonths(1);

        }

        @Override
        public double tinhLai(double st) {
            return (st * this.laiSuat)/100/12; 
        }
    },
    MOT_NAM(1, 6.8) {
        @Override
        public LocalDate tinhDaoHan(LocalDate d) {
            return d.plusYears(1);
        }

        @Override
        public double tinhLai(double st) {
            return (st * this.laiSuat)/100; 
        }
    };
 
    protected int khoangTg; 
    protected double laiSuat;

    private KyHan(int khoangTg, double laiSuat) {
        this.khoangTg = khoangTg;
        this.laiSuat = laiSuat; 
    }

    public abstract LocalDate tinhDaoHan(LocalDate d);
    public abstract double tinhLai(double st); 

}
