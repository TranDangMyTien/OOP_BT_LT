/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.c6;

/**
 *
 * @author PM08
 */
public class SanPham {
    private static int dem;
    private int id = ++dem;
    private String tenSp;
    private double gia;

    public SanPham(String tenSp, double gia) {
        this.tenSp = tenSp;
        this.gia = gia;
    }
    
    public void hienThi() {
        System.out.printf("Ma SP: %d\n", this.id);
        System.out.printf("Ten SP: %s\n", this.tenSp);
        System.out.printf("Gia SP: %.1f\n", this.gia);
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
