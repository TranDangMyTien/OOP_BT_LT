/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.demo;

import com.dht.b09.KyHan;
import com.dht.b09.QuanLyTaiKhoan;
import com.dht.b09.TaiKhoan;
import com.dht.b09.TaiKhoanKyHan;
import java.util.GregorianCalendar;

/**
 *
 * @author admin
 */
public class Demo10 {
    public static void main(String[] args) {
        TaiKhoan t1 = new TaiKhoan("NGUYEN VAN A", 10000);
        TaiKhoanKyHan t2 = new TaiKhoanKyHan("TRAN THI B", 100000, KyHan.MOT_TUAN);
        TaiKhoan t3 = new TaiKhoanKyHan("VO VAN C", 200000, KyHan.MOT_THANG);
        TaiKhoan t4 = new TaiKhoanKyHan("TRAN VAN E", 300000, KyHan.MOT_NAM);
        
        QuanLyTaiKhoan ql = new QuanLyTaiKhoan();
        ql.themTaiKhoan(t1);
        ql.themTaiKhoan(t2, t3, t4);
        ql.traCuu("VAN").forEach(t -> t.hienThi());
        
//        t1.nopTien(1000);
//        t1.hienThi();
//        t2.setNgayDaoHan(new GregorianCalendar());
//        t2.nopTien(1000);
//        t2.hienThi();
//        t3.hienThi();
//        
//        System.out.println(t1.tinhLai());
//        System.out.println(t2.tinhLai());
//        System.out.println(t3.tinhLai());
    }
}
