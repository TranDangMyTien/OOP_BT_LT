/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.c3;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class QuanLyHocVien {

    private ArrayList<HocVien> ds = new ArrayList<>();

    public void themHocVien(HocVien h) {
        this.ds.add(h);
    }

    /**
     * Nhập danh sách học viên
     *
     * @param n Số lượng học viên muốn nhập
     */
    public void nhapDsHv(int n) throws ParseException {
        for (int i = 0; i < n; i++) {
            System.out.printf("== Nhap hoc vien thu %d\n", i + 1);
            HocVien h = new HocVien();
            h.nhapHocVien();
            this.ds.add(h);
        }
    }

    /**
     * Nhập ds học viên từ tập tin
     */
    public void nhapDsHv() throws FileNotFoundException, ParseException {
        File f = new File("src/main/resources/hocvien.txt");
        try ( Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                HocVien h = new HocVien();
                h.setHoTen(sc.nextLine());
                h.setQueQuan(sc.nextLine());
                h.setNgaySinh(CauHinh.f.parse(sc.nextLine()));
                this.ds.add(h);
            }
        }
    }

    public void nhapDiemDs() {
        this.ds.forEach(h -> {
            System.out.printf("== Nhap diem cho hoc vien %s\n", h.getHoTen().toUpperCase());
            h.nhapDiem();
        });
    }

    public void xuatDsHv() {
        this.ds.forEach(h -> h.xuatHocVien());
    }

    public HocVien traCuu(int id) {
        for (HocVien h : this.ds) {
            if (h.getId() == id) {
                return h;
            }
        }
        return null;
    }

    public List<HocVien> traCuu(String tuKhoa) {
        return this.ds.stream().filter(h -> h.getHoTen().contains(tuKhoa) == true).collect(Collectors.toList());
//        ArrayList<HocVien> kq = new ArrayList<>();
//
//        for (HocVien h : this.ds) {
//            if (h.getHoTen().contains(tuKhoa) == true) {
//                kq.add(h);
//            }
//        }
//
//        return kq;
    }
    
    /**
     * Phương thức xác định học viên có học bổng
     * @return Danh sách học viên có học bổng
     */
    public List<HocVien> traCuu() {
        return this.ds.stream().filter(h -> h.isHocBong() == true).collect(Collectors.toList());
//        ArrayList<HocVien> kq = new ArrayList<>();
//
//        for (HocVien h : this.ds) {
//            if (h.isHocBong() == true) {
//                kq.add(h);
//            }
//        }
//
//        return kq;
    }

    public void sapXep() {
        this.ds.sort((h1, h2) -> {
            double tb1 = h1.tinhTb();
            double tb2 = h2.tinhTb();

            return -(tb1 > tb2 ? 1 : (tb1 < tb2 ? -1 : 0));
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
