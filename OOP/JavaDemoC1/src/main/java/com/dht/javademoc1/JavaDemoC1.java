/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.dht.javademoc1;

import com.dht.c1.DsPhanSo;
import com.dht.c1.PhanSo;

/**
 *
 * @author admin
 */
public class JavaDemoC1 {

    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(8, 9);
        PhanSo p2 = new PhanSo(6, 15);
        PhanSo p3 = new PhanSo(-6, 18);
        PhanSo p4 = new PhanSo(7, 5);
        
        DsPhanSo ds = new DsPhanSo();
        ds.themPhanSo(p1);
        ds.themPhanSo(p2);
        ds.themPhanSo(p3);
        ds.themPhanSo(p4);
//        ds.themPhanSo();
//        ds.themPhanSo();
        
        ds.hienThi();
        
        System.out.println("Tong = ");
        ds.tong().hienThi();
        
        System.out.println("=== MAX - Min ===");
        ds.timMax().hienThi();
        ds.timMin().hienThi();
        
        System.out.println("\n=== SAP XEP ===");
        ds.sapXep();
        ds.hienThi();
        
        System.out.println("=== XOA ===");
        ds.xoaPhanSo(1, -3);
        ds.hienThi();
    }
}
