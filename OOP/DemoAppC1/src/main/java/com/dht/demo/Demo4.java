/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.demo;

import com.dht.b05.QuanLyHocVien;
import java.io.FileNotFoundException;
import java.text.ParseException;

/**
 *
 * @author admin
 */
public class Demo4 {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
//        HocVien h1 = new HocVien("Tran Thi B", "Tp.HCM", "11/12/1999");
//        HocVien h2 = new HocVien("Dang Van D", "Binh Duong", "08/10/2001");
        
        QuanLyHocVien ql = new QuanLyHocVien();
//        ql.themHv(h1);
//        ql.themHv(h2);
        ql.docDs();
//        ql.nhapDs(2);
        
        ql.hienThiDs();
        
        System.out.println("== NHAP DIEM ==");
        ql.nhapDiemDs();
        ql.hienThiDs();
        
        System.out.println("== HOC BONG ==");
        ql.traCuu().forEach(h -> h.hienThi());
        System.out.println("== SAP XEP ==");
        ql.sapXep();
        ql.hienThiDs();
    }
}
