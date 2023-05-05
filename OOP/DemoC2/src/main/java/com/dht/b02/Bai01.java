/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.b02;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class Bai01 {
    public static void main(String[] args) throws Exception {
        DoanThang[] a = {
            new DoanThang(new Diem(25, 4), new Diem(8, 9)),
            new DoanThang(new Diem(15, 4), new Diem(8, 6)),
            new DoanThang(new Diem(2, 4), new Diem(5, 9)),
            new DoanThang(new Diem(-5, 34), new Diem(-8, 9))
        };
        Arrays.sort(a, (d1, d2) -> {
            double dt1 = d1.tinhDoDai();
            double dt2 = d2.tinhDoDai();
            if (dt1 > dt2)
                return -1;
            else if (dt1 < dt2)
                return 1;
            return 0;
        });
        for (DoanThang d: a)
            d.hienThi();
       // 
//        Diem d1 = new Diem(5, 9);
//        d1.hienThi();
//        Diem d2 = new Diem(8, 15);
//        d2.hienThi();
//        
//        double kc = d1.tinhKhoangCach(d2);
//        System.out.println("Khoang cach = " + kc);
//        
//        
//        DoanThang dt1 = new DoanThang(d1, d2);
//        dt1.hienThi();
//        System.out.println("Do dai = " + dt1.tinhDoDai());
//        Diem td = dt1.timTrungDiem();
//        System.out.print("Trung diem = ");
//        td.hienThi();
//        
//        DoanThang d11 = new DoanThang(new Diem(0, 1), new Diem(1, 0));
//        DoanThang d22 = new DoanThang(new Diem(0, 2), new Diem(2, 0));
//        if (d11.isSongSong(d22) == true)
//            System.out.println("SONG SONG");
//        else
//            System.out.println("KHONG");
//        
//        
//        HinhChuNhat hcn = new HinhChuNhat(new Diem(2, -5), new Diem(5, 1));
//        System.out.println("Dien tich = " + hcn.tinhDienTich());
    }
}
