/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.BTH22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class QLHinh {

    private List<Hinh> ds = new ArrayList<>();

    public void themHinh(Hinh... a) {
        this.ds.addAll(Arrays.asList(a));

    }

    public void xoaHinh(String t) {
        this.ds.removeIf(h -> h.getTen().contains(t));
    }

    public void hienThi() {
        this.ds.forEach(h -> System.out.println(h));
    }

    public void sapXep1() {

        this.ds.sort((h1, h2) -> {

            if (h1.getTen().equals(h2.getTen())) {
                double dt1 = h1.tinhDienTich();
                double dt2 = h2.tinhDienTich();

                return (dt1 > dt2 ? 1 : (dt1 < dt2 ? -1 : 0)); // đao nguoc dau neu giam dan 
            }

            return h1.getTen().compareTo(h2.getTen());

        });

    }

    public List<Hinh> timTheoLoai(String classPath) throws ClassNotFoundException {
        Class c = Class.forName(classPath);
        return this.ds.stream().filter(h -> c.isInstance(h)).collect(Collectors.toList());
    }

    public int timHinh(Hinh h) {
        return this.ds.indexOf(h);
    }

    /**
     * @return the ds
     */
    public List<Hinh> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<Hinh> ds) {
        this.ds = ds;
    }

}
