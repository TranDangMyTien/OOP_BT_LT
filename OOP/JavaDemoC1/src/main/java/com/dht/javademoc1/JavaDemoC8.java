/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.javademoc1;

import com.dht.c6.BangDia;
import com.dht.c6.QuanLySanPham;
import com.dht.c6.Sach;
import com.dht.c6.SanPham;

/**
 *
 * @author PM08
 */
public class JavaDemoC8 {
    public static void main(String[] args) {
        SanPham s1 = new Sach("Lap trinh Java", 20000, 100);
        SanPham s2 = new Sach("Lap trinh Web", 30000, 150);
        SanPham s3 = new BangDia("Gioi thieu OU", 15000, 30);
        
        QuanLySanPham ql = new QuanLySanPham();
        ql.themSp(s1);
        ql.themSp(s2);
        ql.themSp(s3);
        ql.hienThi();
        
        System.out.println("== SORT");
        ql.sapXep();
        ql.hienThi();
        
        System.out.println("== KHOANG GIA");
        ql.traCuu(20000, 30000).forEach(s -> s.hienThi());
    }
}
