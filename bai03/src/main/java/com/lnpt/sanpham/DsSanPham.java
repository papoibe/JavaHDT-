/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.sanpham;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class DsSanPham {

    private List<SanPham> ds = new ArrayList<>();

    public void themSp(SanPham... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void themSp(String classPath) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        //reflection 
        Class c = Class.forName(classPath);
        SanPham s = (SanPham) c.getConstructor().newInstance();
        s.nhap();
        this.ds.add(s);
//        SanPham s = new Sach(); 
//        s.nhap();
//        this.ds.add(s);
    }

    public void hienThi() {
        this.ds.forEach(s -> s.hienThi());

    }

    /**
     * @return the ds
     */
    public List<SanPham> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }

}
