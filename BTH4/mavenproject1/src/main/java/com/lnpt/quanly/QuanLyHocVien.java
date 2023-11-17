/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.quanly;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */

public class QuanLyHocVien {
    private List<HocVien> ds = new ArrayList<>();
    
    public void themHv(HocVien... a){
        this.getDs().addAll(Arrays.asList(a));
        
    }
    
    public void themHv(){
            HocVien h = new HocVien();
            h.nhap1Hv();
            this.getDs().add(h);
    }
    
    public void docDsHv() throws FileNotFoundException {
        File f = new File("src/main/resources/hv.txt");
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                String t = sc.nextLine();
                String ns = sc.nextLine();
                HocVien h = new HocVien(t, ns);
                this.ds.add(h); 
                
            }
        }
    }
    public void nhapDiemDs() {
        // ... 
    }
    
    
    public void hienThi(){
        this.getDs().forEach(h -> h.hienThi());
    }

    /**
     * @return the ds
     */
    public List<HocVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<HocVien> ds) {
        this.ds = ds;
    }
    
    
}