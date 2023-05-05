/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.c6;

/**
 *
 * @author PM08
 */
public class Sach extends SanPham {
    private int soTrang;

    public Sach(String tenSp, double gia, int soTrang) {
        super(tenSp, gia);
        this.soTrang = soTrang;
    }

    @Override
    public void hienThi() {
        super.hienThi(); 
        System.out.printf("So trang: %d\n", this.soTrang);
    }
    
    

    /**
     * @return the soTrang
     */
    public int getSoTrang() {
        return soTrang;
    }

    /**
     * @param soTrang the soTrang to set
     */
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
}
