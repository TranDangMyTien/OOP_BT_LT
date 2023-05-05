/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.demo;

import com.dht.b04.HocVien;
import com.dht.b04.QuanLyHocVien;
import java.io.FileNotFoundException;
import java.text.ParseException;

/**
 *
 * @author admin
 */
public class Demo3 {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        HocVien h1 = new HocVien("Nguyen Van A", "Tp.HCM", "22/12/1999");
        HocVien h2 = new HocVien("Tran Thi B", "Can Tho", "15/11/2000");
       
        QuanLyHocVien ql = new QuanLyHocVien();
//        ql.themHv(h1);
//        ql.themHv(h2);
        ql.docDs();
        //ql.nhapDsHv(2);
        ql.hienThi();
        System.out.println("=== NHAP DIEM ===");
        ql.nhapDiemDs();
        ql.hienThi();
        System.out.println("=== SAP XEP ===");
        ql.sapXep();
        ql.hienThi();
        System.out.println("=== HOC BONG ===");
        ql.traCuu().forEach(h -> h.hienThi());
    }
}
