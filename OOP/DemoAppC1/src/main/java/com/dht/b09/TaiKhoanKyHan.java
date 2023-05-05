/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.b09;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author admin
 */
public class TaiKhoanKyHan extends TaiKhoan {
    private KyHan kyHan;
    private Calendar ngayDaoHan;

    public TaiKhoanKyHan(String tenTk, double soTien, KyHan kyHan) {
        super(tenTk, soTien);
        this.kyHan = kyHan;
        
        this.ngayDaoHan = this.kyHan.tinhDaoHan();
//        switch (kyHan) {
//            case MOT_TUAN -> this.ngayDaoHan.add(Calendar.DAY_OF_YEAR, 7);
//            case MOT_THANG -> this.ngayDaoHan.add(Calendar.MONTH, 1);
//            case MOT_NAM -> this.ngayDaoHan.add(Calendar.YEAR, 1);
//        }
    }

    @Override
    public void hienThi() {
        super.hienThi(); 
        
        System.out.printf("Ky han: %s\nNgay dao han: %s\n", 
                this.kyHan, f.format(this.ngayDaoHan.getTime()));
    }

    @Override
    public boolean isDaoHan() {
        Calendar c = new GregorianCalendar();
        boolean v1 = this.ngayDaoHan.get(Calendar.YEAR) == c.get(Calendar.YEAR);
        boolean v2 = this.ngayDaoHan.get(Calendar.DAY_OF_YEAR) == c.get(Calendar.DAY_OF_YEAR);
        
        return v1 && v2;
    }

    @Override
    public double tinhLai() {
        return this.kyHan.tinhLai(this.soTien);
    }
    

    /**
     * @return the kyHan
     */
    public KyHan getKyHan() {
        return kyHan;
    }

    /**
     * @param kyHan the kyHan to set
     */
    public void setKyHan(KyHan kyHan) {
        this.kyHan = kyHan;
    }

    /**
     * @return the ngayDaoHan
     */
    public Calendar getNgayDaoHan() {
        return ngayDaoHan;
    }

    /**
     * @param ngayDaoHan the ngayDaoHan to set
     */
    public void setNgayDaoHan(Calendar ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }
}
