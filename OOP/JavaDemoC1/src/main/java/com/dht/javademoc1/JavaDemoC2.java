/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.javademoc1;

import com.dht.c2.DsPhanSo;
import com.dht.c2.PhanSo;

/**
 *
 * @author admin
 */
public class JavaDemoC2 {
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(36, 48);
        PhanSo p2 = new PhanSo(3, 4);
        PhanSo p3 = new PhanSo(-9, 6);
        PhanSo p4 = new PhanSo(7, 14);
        
        DsPhanSo ds = new DsPhanSo();
        ds.themPhanSo(p1);
        ds.themPhanSo(p2);
        ds.themPhanSo(p3);
        ds.themPhanSo(p4);
//        ds.themPhanSo();
//        ds.themPhanSo();
        
        ds.hienThi();
        
        System.out.printf("Tong = ");
        ds.tong().hienThi();
        
        System.out.println("== SAP XEP ==");
        ds.sapXep();
        ds.hienThi();
        
         System.out.println("== XOA ==");
         ds.xoaPhanSo(3, -2);
         ds.hienThi();
    }
}
