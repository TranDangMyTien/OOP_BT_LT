/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.c5;

/**
 *
 * @author PM08
 */
public class Sach extends SanPham {
    private int soTrang;
    
    public Sach(String tenSp, double gia, int st) {
        super(tenSp, gia);
        this.soTrang = st;
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
