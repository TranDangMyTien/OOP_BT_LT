/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.javademoc1;

import com.dht.c3.HocVien;
import com.dht.c3.QuanLyHocVien;
import java.io.FileNotFoundException;
import java.text.ParseException;

/**
 *
 * @author admin
 */
public class JavaDemoC3 {

    public static void main(String[] args) throws ParseException, FileNotFoundException {
//        HocVien h1 = new HocVien("Nguyen Van A", "Tp.HCM", "15/09/1999");
//        HocVien h2 = new HocVien("Tran Thi B", "Long An", "12/09/2000");

        QuanLyHocVien ql = new QuanLyHocVien();
//        ql.themHocVien(h1);
//        ql.themHocVien(h2);
        ql.nhapDsHv();
        //ql.nhapDsHv(2);

        System.out.println("== DANH SACH HV ===");
        ql.xuatDsHv();
        
        System.out.println("== DANH SACH DIEM ===");
        ql.nhapDiemDs();
        ql.xuatDsHv();
//        
        System.out.println("== TIM KIEM ID ===");
        HocVien h11 = ql.traCuu(1);
        if (h11 == null) {
            System.out.println("KHONG THAY");
        } else {
            h11.xuatHocVien();
        }
        
        System.out.println("== TIM KIEM TU KHOA ===");
        ql.traCuu("Van").forEach(h22 -> h22.xuatHocVien());
        
        System.out.println("== SAP XEP ===");
        ql.sapXep();
        ql.xuatDsHv();
        
        System.out.println("== DANH SÁCH CÓ HỌC BỔNG ===");
        ql.traCuu().forEach(h -> h.xuatHocVien());
    }
}
