/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.demo;

import com.dht.b03.DsPhanSo;
import com.dht.b03.PhanSo;

/**
 *
 * @author admin
 */
public class Demo2 {
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(8, 9);
        PhanSo p2 = new PhanSo(-4, 5);
        PhanSo p3 = new PhanSo(8, -7);
        
        DsPhanSo d = new DsPhanSo();
        d.themPhanSo(p1);
        d.themPhanSo(p2);
        d.themPhanSo(p3);
        d.themPhanSo(new PhanSo(8, 15));
        d.themPhanSo(new PhanSo(4, 2));
//        d.themPhanSo();
//        d.themPhanSo();
        
        d.hienThi();
        System.out.print("Tong = ");
        d.tong().hienThi();
        System.out.println("");
        
        d.xoaPhanSo(8, -7);
        d.hienThi();
        
        d.sapXep();
        d.hienThi();
    }
}
