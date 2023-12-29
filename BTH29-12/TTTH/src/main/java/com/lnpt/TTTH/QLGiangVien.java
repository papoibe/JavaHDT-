/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnpt.TTTH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class QLGiangVien {
    private List<GiangVien> gvs = new ArrayList<>();
    
    public void themGV(GiangVien...gv){
        gvs.addAll(Arrays.asList(gv)); 
    }
    public void xoaGV(GiangVien gv) {
        gvs.remove(gv);
    }
    
    public void tinhTienLuong(){
        
        
        
        
    }
    public List<GiangVien> traCuu(String tuKhoa) {    
        return gvs.stream().filter(gv -> gv.getHoTen().contains(tuKhoa)).collect(Collectors.toList());
        
    }
    
    
    
}
