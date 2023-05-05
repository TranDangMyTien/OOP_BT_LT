/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.demo;

import com.dht.b07.BangDia;
import com.dht.b07.QuanLySanPham;
import com.dht.b07.Sach;
import com.dht.b07.SanPham;

/**
 *
 * @author admin
 */
public class Demo8 {
    public static void main(String[] args) {
        SanPham s1 = new Sach("Lap trinh Java", 20000, 100);
        SanPham s2 = new Sach("Lap trinh Web", 30000, 150);
        SanPham s3 = new BangDia("Gioi thieu OU IT", 15000, 30);
        
        QuanLySanPham ql = new QuanLySanPham();
        ql.themSp(s1);
        ql.themSp(s2);
        ql.themSp(s3);
        
        System.out.println("=== SAP XEP ===");
        ql.sapXep();
        ql.hienThi();
        System.out.println("=== TIM THEO GIA ===");
        ql.traCuu(15000, 20000).forEach(s -> s.hienThi());
    }
}
