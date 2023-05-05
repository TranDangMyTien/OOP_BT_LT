/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.javademoc1;

import com.dht.c4.HocVien;
import com.dht.c4.QuanLyHocVien;
import java.io.FileNotFoundException;
import java.text.ParseException;

/**
 *
 * @author admin
 */
public class JavaDemoC4 {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
//        HocVien h1 = new HocVien("Nguyen Van A", "Tp.HCM", "15/11/2001");
//        HocVien h2 = new HocVien("Tran Thi B", "Can Tho", "11/11/2002");
        
        QuanLyHocVien ql = new QuanLyHocVien();
//        ql.themHv(h1);
//        ql.themHv(h2);
        ql.docDsHocVien();
        //ql.nhapDsHocVien(2);
        
        ql.xuatDsHocVien();
        
        System.out.println("=== NHAP DIEM ===");
        ql.nhapDiemDsHocVien();
        ql.xuatDsHocVien();
        
        System.out.println("=== TRA CUU ID ===");
        HocVien k = ql.traCuu(2);
        if (k == null)
            System.out.println("KHONG TIM THAY");
        else
            k.xuatHv();
        
        System.out.println("=== TRA CUU TEN ===");
        ql.traCuu("Van").forEach(h -> h.xuatHv());
        
        System.out.println("=== HOC BONG ===");
        ql.traCuu().forEach(h -> h.xuatHv());
        
        System.out.println("=== SAP XEP  ===");
        ql.sapXep();
        ql.xuatDsHocVien();
    }
}
