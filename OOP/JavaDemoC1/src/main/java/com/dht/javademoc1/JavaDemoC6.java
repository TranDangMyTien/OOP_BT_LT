/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.javademoc1;

import com.dht.c5.BangDia;
import com.dht.c5.QuanLySanPham;
import com.dht.c5.Sach;
import com.dht.c5.SanPham;

/**
 *
 * @author PM08
 */
public class JavaDemoC6 {
    public static void main(String[] args) {
        SanPham s1 = new Sach("Lap trinh Java", 10000, 100);
        SanPham s2 = new Sach("Lap trinh Web", 20000, 150);
        SanPham s3 = new BangDia("Gioi thieu OU", 15000, 30);
        
        QuanLySanPham ql = new QuanLySanPham();
        ql.themSp(s1);
        ql.themSp(s2);
        ql.themSp(s3);
        
        ql.hienThi();
        System.out.println("=== SX");
        ql.sapXep();
        ql.hienThi();
        System.out.println("=== Khoang gia");
        ql.traCuu(15000, 20000).forEach(s -> s.hienThi());
    }
}
