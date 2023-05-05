/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.b04;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class QuanLyHocVien {
    private ArrayList<HocVien> ds = new ArrayList<>();
    
    public void themHv(HocVien h) {
        this.ds.add(h);
    }
    
    public void nhapDsHv(int n) throws ParseException {
        for (int i = 0; i < n; i++) {
            System.out.printf("== Nhap hoc vien thu %d\n", i);
            HocVien h = new HocVien();
            h.nhapHv();
            this.ds.add(h);
        }
    }
    
    public void nhapDiemDs() {
        this.ds.forEach(h -> {
            System.out.printf("== Nhap diem cho %s\n", h.getHoTen().toUpperCase());
            h.nhapDiem();
        });
    }
    
    public void docDs() throws FileNotFoundException, ParseException {
        File f = new File("src/main/resources/hocvien.txt");
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                HocVien h = new HocVien();
                h.setHoTen(sc.nextLine());
                h.setQueQuan(sc.nextLine());
                h.setNgaySinh(CauHinh.f.parse(sc.nextLine()));
                
                this.ds.add(h);
            }
        }
    }
    
    public HocVien traCuu(int id) {
        for (HocVien h: this.ds)
            if (h.getId() == id)
                return h;
        return null;
    }
    
    public ArrayList<HocVien> traCuu(String tuKhoa) {
        ArrayList<HocVien> kq = new ArrayList<>();
        
        for (HocVien h: this.ds)
            if (h.getHoTen().contains(tuKhoa) == true)
                kq.add(h);
        
        return kq;
    }
    
    public ArrayList<HocVien> traCuu() {
         ArrayList<HocVien> kq = new ArrayList<>();
        
        for (HocVien h: this.ds)
            if (h.isHocBong() == true)
                kq.add(h);
        
        return kq;
    }
    
    public void hienThi() {
        this.ds.forEach(h -> h.hienThi());
    }
    
    public void sapXep() {
        this.ds.sort((h1, h2) -> {
            double tb1 = h1.tinhTrungBinh();
            double tb2 = h2.tinhTrungBinh();
            
            if (tb1 > tb2)
                return 1;
            else if (tb1 < tb2)
                return -1;
            return 0;
        });
    }
 
    /**
     * @return the ds
     */
    public ArrayList<HocVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(ArrayList<HocVien> ds) {
        this.ds = ds;
    }
}
