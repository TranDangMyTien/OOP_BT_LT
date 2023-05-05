/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.b02;

/**
 *
 * @author admin
 */
public class DoanThang {
    private Diem a;
    private Diem b;

    /**
     * Phương thức khởi tạo hai tham số
     * @param a: điểm đầu
     * @param b: điềm cuối
     */
    public DoanThang(Diem a, Diem b) {
        this.a = a;
        this.b = b;
    }
    
    public void hienThi() {
        System.out.printf("[(%.1f, %.1f), (%.1f, %.1f)]\n",
                a.getHoanhDo(), a.getTungDo(), b.getHoanhDo(), b.getTungDo());
    }
    
    public double tinhDoDai() {
        return a.tinhKhoangCach(b);
    }
    
    public Diem timTrungDiem() {
        double x = (a.getHoanhDo() + b.getHoanhDo()) / 2;
        double y = (a.getTungDo() + b.getTungDo()) / 2;
        
        return new Diem(x, y);
    }
    
    public boolean isSongSong(DoanThang dt) {
        double vt = (a.getHoanhDo() - b.getHoanhDo())*(dt.getA().getTungDo() - dt.getB().getTungDo());
        double vp = (a.getTungDo()- b.getTungDo())*(dt.getA().getHoanhDo()- dt.getB().getHoanhDo());
        
        return vt == vp;
    }

    /**
     * @return the a
     */
    public Diem getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Diem a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public Diem getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Diem b) {
        this.b = b;
    }
}
