/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.b02;

import java.util.stream.Stream;

/**
 *
 * @author admin
 */
public class Bai01 {
    public static void main(String[] args) throws Exception {
        Diem d1 = new Diem(5, 8);
        d1.hienThi();
        Diem d2 = new Diem(8, 7);
        d2.hienThi();
        
        double kc = d1.tinhKhoangCach(d2); 
        System.out.println("Khoang cach = " + kc);
        
        DoanThang dt1 = new DoanThang(d1, d2);
        dt1.hienThi();
        double dd = dt1.tinhDoDai();
        System.out.println("Do dai doanh thang = " + dd);
        
        Diem td = dt1.timTrungDiem();
        System.out.print("\nTrung diem doan thang: ");
        td.hienThi();
        
        
        DoanThang dt2 = new DoanThang(new Diem(1, 0), new Diem(0, 1));
        DoanThang dt3 = new DoanThang(new Diem(2, 0), new Diem(0, 2));
        
        if (dt2.isSongSong(dt3)== true)
            System.out.println("\nSONG SONG");
        else
            System.out.println("\nKHONG");
        
        
        HinhChuNhat hcn = new HinhChuNhat(new Diem(1, 5), new Diem(7, 2));
        System.out.println("Dien tich hinh chu nhat: " + hcn.tinhDienTich());
        
        System.out.println("=== STREAM ====");
        DoanThang[] a = {dt1, dt2, dt3};
        
        Stream.of(a).forEach(x -> x.hienThi());
        System.out.println("Doan thang dai nhat");
        Stream.of(a).max((dt11, dt22) -> {
            double dai1 = dt11.tinhDoDai();
            double dai2 = dt22.tinhDoDai();
            
            if (dai1 > dai2)
                return 1;
            else if (dai1 < dai2)
                return -1;
            return 0;
        }).get().hienThi();
    }
}
