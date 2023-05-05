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
     * Phương thức khởi tạo 2 tham số
     * @param a tham số điểm đầu
     * @param b tham số điểm cuối
     */
    public DoanThang(Diem a, Diem b) {
        this.a = a;
        this.b = b;
    }
    
    public void hienThi() {
        System.out.printf("[(%d, %d), (%d, %d)] -> Do dai: %.1f\n",
                a.getHoanhDo(), a.getTungDo(),
                b.getHoanhDo(), b.getTungDo(), tinhDoDai());
    }
    
    public double tinhDoDai() {
        return a.tinhKhoangCach(b);
    }
    
    public Diem timTrungDiem() {
        int x = (a.getHoanhDo() + b.getHoanhDo())/2;
        int y = (a.getTungDo() + b.getTungDo())/2;
        
        return new Diem(x, y);
    }
    
    public boolean isSongSong(DoanThang d) {
        int vt = (a.getHoanhDo() - b.getHoanhDo())*(d.getA().getTungDo() - d.getB().getTungDo());
        int vp = (a.getTungDo()- b.getTungDo())*(d.getA().getHoanhDo()- d.getB().getHoanhDo());
        
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
