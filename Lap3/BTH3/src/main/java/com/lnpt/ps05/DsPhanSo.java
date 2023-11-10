/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.ps05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class DsPhanSo {
    private List<PhanSo> ds = new ArrayList<>();
    
    
    public void themPs(PhanSo p) {
        this.ds.add(p); 
    }
    
    public void themPs(PhanSo... a) {
        this.ds.addAll(Arrays.asList(a)); 
    }
    
    
    public void themPs() {
        PhanSo p = new PhanSo();
        p.nhapPs();
        
        this.ds.add(p); 
    }
    
    
    public void hienThi() {
        for(PhanSo p: this.ds)
            p.hienThi();
    }

    
    
    /**
     * @return the ds
     */
    public List<PhanSo> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<PhanSo> ds) {
        this.ds = ds;
    }
}
