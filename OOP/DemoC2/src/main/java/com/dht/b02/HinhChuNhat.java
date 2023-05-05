/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.b02;

/**
 *
 * @author admin
 */
public class HinhChuNhat {
    private Diem trenTrai;
    private Diem duoiPhai;

    public HinhChuNhat(Diem trenTrai, Diem duoiPhai) throws Exception {
        if (duoiPhai.getHoanhDo() > trenTrai.getHoanhDo() &&
                trenTrai.getTungDo() > duoiPhai.getTungDo()) {
            this.trenTrai = trenTrai;
            this.duoiPhai = duoiPhai;
        } else
            throw new Exception("Invalid Data!!");
        
    }
    
    public double tinhDienTich() {
       int cr = duoiPhai.getHoanhDo() - trenTrai.getHoanhDo();
       int cd  = trenTrai.getTungDo() - duoiPhai.getTungDo();
       return cr * cd;
    }
    
    

    /**
     * @return the trenTrai
     */
    public Diem getTrenTrai() {
        return trenTrai;
    }

    /**
     * @param trenTrai the trenTrai to set
     */
    public void setTrenTrai(Diem trenTrai) {
        this.trenTrai = trenTrai;
    }

    /**
     * @return the duoiPhai
     */
    public Diem getDuoiPhai() {
        return duoiPhai;
    }

    /**
     * @param duoiPhai the duoiPhai to set
     */
    public void setDuoiPhai(Diem duoiPhai) {
        this.duoiPhai = duoiPhai;
    }
}
