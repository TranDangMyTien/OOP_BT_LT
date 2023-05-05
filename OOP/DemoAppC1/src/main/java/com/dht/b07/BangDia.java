/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.b07;

/**
 *
 * @author admin
 */
public class BangDia extends SanPham {
    private double doDai;

    public BangDia(String tenSp, double gia, double doDai) {
        super(tenSp, gia);
        this.doDai = doDai;
    }

    @Override
    public void hienThi() {
        super.hienThi(); 
        System.out.printf("Do dai: %.1f\n", this.doDai);
    }
    
    

    /**
     * @return the doDai
     */
    public double getDoDai() {
        return doDai;
    }

    /**
     * @param doDai the doDai to set
     */
    public void setDoDai(double doDai) {
        this.doDai = doDai;
    }
}
