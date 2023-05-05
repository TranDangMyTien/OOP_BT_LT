/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.c4;

import java.text.ParseException;
import java.util.Date;
import java.util.stream.DoubleStream;

/**
 *
 * @author admin
 */
public class HocVien {
    private static int dem = 0;
    private int id;
    private String hoTen;
    private String queQuan;
    private Date ngaySinh;
    private double[] diem;
    
    {
        id = ++dem;
    }

    public HocVien() {
    }

    public HocVien(String hoTen, String queQuan, Date ngaySinh) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
    }
    
    public HocVien(String hoTen, String queQuan, String ngaySinh) throws ParseException {
        this(hoTen, queQuan, CauHinh.f.parse(ngaySinh));
    }
    
    public void nhapHv() throws ParseException {
        System.out.print("Ho ten: ");
        this.hoTen = CauHinh.sc.nextLine();
        System.out.print("Que quan: ");
        this.queQuan = CauHinh.sc.nextLine();
        System.out.print("Ngay sinh (dd/MM/yyyy): ");
        this.ngaySinh = CauHinh.f.parse(CauHinh.sc.nextLine());
    }
    
    public void xuatHv() {
        System.out.printf("Id: %d\n", this.id);
        System.out.printf("Ho ten: %s\n", this.hoTen);
        System.out.printf("Que quan: %s\n", this.queQuan);
        System.out.printf("Ngay sinh: %s\n", CauHinh.f.format(this.ngaySinh));
        
        if (this.diem != null) {
            for (double d: this.diem)
                System.out.printf("%.1f\t", d);
            System.out.printf("\nDiem trung binh: %.1f\n", this.tinhTrungBinh());
        }
    }
    
    public void nhapDiem() {
        this.diem = new double[CauHinh.SO_MON_HOC];
        for (int i = 0; i < CauHinh.SO_MON_HOC; i++) {
            System.out.printf("== Nhap diem mon thu %d\n", i + 1);
            this.diem[i] = Double.parseDouble(CauHinh.sc.nextLine());
        }
    }
    
    public double tinhTrungBinh() {
        return DoubleStream.of(this.diem).average().getAsDouble();
    }
    
    public boolean isHocBong() {
        for (double d: this.diem)
            if (d < 5)
                return false;
        
        return this.tinhTrungBinh() >= 8;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the diem
     */
    public double[] getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double[] diem) {
        this.diem = diem;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
