/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.b09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author admin
 */
public class TaiKhoan {
    protected static final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    private static int dem = 0;
    protected String soTk;
    protected String tenTk;
    protected double soTien;
    protected Calendar ngayTao;
    
    {
        soTk = String.format("%06d", ++dem);
        ngayTao = new GregorianCalendar();
    }

    public TaiKhoan(String tenTk, double soTien) {
        this.tenTk = tenTk;
        this.soTien = soTien;
    }
    
    public void hienThi() {
        System.out.printf("So tai khoan: %s\nTen tai khoan: %s\nSo tien: %.1f\nNgay tao: %s\n",
                this.soTk, this.tenTk, this.soTien, f.format(this.ngayTao.getTime()));
    }
    
    public void nopTien(double st) {
        if (this.isDaoHan())
            this.soTien += st;
    }
    
    public void rutTien(double  st) {
        if (this.isDaoHan() && this.soTien >= st)
            this.soTien -= st;
    }
    
    public boolean isDaoHan() {
        return true;
    }
    
    public double tinhLai() {
        return (this.soTien * 0.1)/(100*12);
    }

    /**
     * @return the soTk
     */
    public String getSoTk() {
        return soTk;
    }

    /**
     * @param soTk the soTk to set
     */
    public void setSoTk(String soTk) {
        this.soTk = soTk;
    }

    /**
     * @return the tenTk
     */
    public String getTenTk() {
        return tenTk;
    }

    /**
     * @param tenTk the tenTk to set
     */
    public void setTenTk(String tenTk) {
        this.tenTk = tenTk;
    }

    /**
     * @return the soTien
     */
    public double getSoTien() {
        return soTien;
    }

    /**
     * @param soTien the soTien to set
     */
    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    /**
     * @return the ngayTao
     */
    public Calendar getNgayTao() {
        return ngayTao;
    }

    /**
     * @param ngayTao the ngayTao to set
     */
    public void setNgayTao(Calendar ngayTao) {
        this.ngayTao = ngayTao;
    }
}
