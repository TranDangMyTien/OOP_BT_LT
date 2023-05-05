/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.demo;

import com.dht.b06.BangDia;
import com.dht.b06.QuanLySanPham;
import com.dht.b06.Sach;
import com.dht.b06.SanPham;

/**
 *
 * @author admin
 */
public class Demo6 {
    public static void main(String[] args) {
        SanPham s1 = new Sach("Lap trinh Java", 20000, 100);
        SanPham s2 = new Sach("Lap trinh Web", 30000, 200);
        SanPham s3 = new BangDia("Gioi thieu OU IT", 15000, 30);
        
        QuanLySanPham ql = new QuanLySanPham();
        ql.themSp(s1);
        ql.themSp(s2);
        ql.themSp(s3);
        
        ql.hienThi();
        
        System.out.println("== SAP XEP");
        ql.sapXep();
        ql.hienThi();
        
        System.out.println("== TIM THEO GIA");
        ql.traCuu(15000, 20000).forEach(s -> s.hienThi());
    }
}
