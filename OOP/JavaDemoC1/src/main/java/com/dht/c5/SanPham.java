/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.c5;

/**
 *
 * @author PM08
 */
public class SanPham {
    private static int dem;
    protected int id = ++dem;
    protected String tenSp;
    protected double gia;

    public SanPham(String tenSp, double gia) {
        this.tenSp = tenSp;
        this.gia = gia;
    }
    
    public void hienThi() {
        System.out.printf("Ma sp: %d\n", this.id);
        System.out.printf("Ten sp: %s\n", this.tenSp);
        System.out.printf("Gia sp: %.1f\n", this.gia);
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the tenSp
     */
    public String getTenSp() {
        return tenSp;
    }

    /**
     * @param tenSp the tenSp to set
     */
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    /**
     * @return the gia
     */
    public double getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(double gia) {
        this.gia = gia;
    }
}
