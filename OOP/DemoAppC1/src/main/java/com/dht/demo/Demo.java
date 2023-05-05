/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.demo;

import com.dht.b03.PhanSo;

/**
 *
 * @author admin
 */
public class Demo {
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(2, 3);
        PhanSo p2 = new PhanSo(36, 48);
        
        p1.hienThi();
        p2.hienThi();
        p2.rutGon().hienThi();
        System.out.println(p2.soSanh(p1));
        
        PhanSo[] a = {
            new PhanSo(6, 7),
            new PhanSo(1, -8),
            new PhanSo(7, 9),
            new PhanSo(8, -3),
            new PhanSo(5, 7)
        };
        
        // Duyệt danh sách phân số
        for (PhanSo p: a)
            p.hienThi();
        System.out.println("");
        
        // Tính tổng các phân sô trong mảng
        PhanSo t = new PhanSo();
        for (PhanSo p: a)
            t = t.cong(p);
        System.out.print("Tong = ");
        t.rutGon().hienThi();
        
        // Tìm phân số lớn nhất
        PhanSo max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i].soSanh(max) > 0)
                max = a[i];
        System.out.print("Max = ");
        max.hienThi();
    }
}
