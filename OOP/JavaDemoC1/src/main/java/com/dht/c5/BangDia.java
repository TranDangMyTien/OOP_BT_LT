/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.c5;

/**
 *
 * @author PM08
 */
public class BangDia extends SanPham {
    private double thoiGianPhat;

    public BangDia(String tenSp, double gia, double thoiGianPhat) {
        super(tenSp, gia);
        this.thoiGianPhat = thoiGianPhat;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Do dai phat: %.1f\n", this.thoiGianPhat);
    }
    
    

    /**
     * @return the thoiGianPhat
     */
    public double getThoiGianPhat() {
        return thoiGianPhat;
    }

    /**
     * @param thoiGianPhat the thoiGianPhat to set
     */
    public void setThoiGianPhat(double thoiGianPhat) {
        this.thoiGianPhat = thoiGianPhat;
    }
}
