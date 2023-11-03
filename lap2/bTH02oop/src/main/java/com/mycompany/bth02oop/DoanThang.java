/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth02oop;

/**
 *
 * @author admin
 */
public class DoanThang {
    private Diem diemDau; 
    private Diem diemCuoi; 
    
    public DoanThang(Diem diemDau, Diem diemCuoi) {
        this.diemDau = diemDau; 
        this.diemCuoi = diemCuoi; 
    }
    
    public void hienThi() {
        System.out.printf("[(&.1f, %.1f),(&.1f, %.1f)]", 
                this.diemDau.getHoanhDo(), this.diemDau.getTungDo(),
                this.diemCuoi.getHoanhDo(), this.diemCuoi.getTungDo()); 
    }
   
    public double tinhDoDai() {
        return this.diemDau.tinhKhoangCach(this.diemCuoi);
    }
    
    
    public Diem tinhTrungDiem() {
        double x = (this.diemDau.getHoanhDo() + this.diemCuoi.getHoanhDo()/2);
        double y = (this.diemDau.getTungDo() + this.diemCuoi.getTungDo()); 
        return new Diem(x, y); 
    }
    
    
    public boolean isSongSong(DoanThang d) {
        // this & d
       double v1 = (this.diemDau.getHoanhDo() - this.diemCuoi.getHoanhDo()) * 
               (d.getDiemDau().getTungDo() - d.getDiemCuoi().getTungDo());
       double v2 = (this.diemDau.getTungDo() - this.diemCuoi.getTungDo())* 
               (d.getDiemDau().getHoanhDo() - d.getDiemCuoi().getHoanhDo()); 
       return v1 == v2;
    }
    
   
    /**
     * @return the diemDau
     */
    public Diem getDiemDau() {
        return diemDau;
    }

    /**
     * @param diemDau the diemDau to set
     */
    public void setDiemDau(Diem diemDau) {
        this.diemDau = diemDau;
    }

    /**
     * @return the diemCuoi
     */
    public Diem getDiemCuoi() {
        return diemCuoi;
    }

    /**
     * @param diemCuoi the diemCuoi to set
     */
    public void setDiemCuoi(Diem diemCuoi) {
        this.diemCuoi = diemCuoi;
    }
}
