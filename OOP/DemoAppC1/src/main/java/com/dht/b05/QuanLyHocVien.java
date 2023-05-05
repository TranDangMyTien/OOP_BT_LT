/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.b05;

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

    public void themHv(HocVien h) {
        this.ds.add(h);
    }

    public void nhapDs(int n) throws ParseException {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap hoc vien %d\n", i + 1);
            HocVien h = new HocVien();
            h.nhapHv();
            this.ds.add(h);
        }
    }

    public void hienThiDs() {
        this.ds.forEach(h -> h.hienThi());
    }

    public void nhapDiemDs() {
        this.ds.forEach(h -> {
            System.out.printf("== Nhap diem cho %s\n", h.getHoTen().toUpperCase());
            h.nhapDiem();
        });
    }

    public void docDs() throws FileNotFoundException, ParseException {
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

    public HocVien traCuu(int id) {
        return this.ds.stream().filter(d -> d.getId() == id).findFirst().get();
//        for (HocVien d : this.ds) {
//            if (d.getId() == id) {
//                return d;
//            }
//        }
//        return null;
    }

    public List<HocVien> traCuu(String tuKhoa) {
        return this.ds.stream().filter(h -> h.getHoTen().contains(tuKhoa) || h.getQueQuan().contains(tuKhoa)).collect(Collectors.toList());
//        ArrayList<HocVien> kq = new ArrayList<>();
//
//        for (HocVien h : this.ds) {
//            if (h.getHoTen().contains(tuKhoa) == true
//                    || h.getQueQuan().contains(tuKhoa) == true) {
//                kq.add(h);
//            }
//        }
//
//        return kq;
    }

    public List<HocVien> traCuu() {
        return this.ds.stream().filter(h ->h.isHocBong()).collect(Collectors.toList());
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
