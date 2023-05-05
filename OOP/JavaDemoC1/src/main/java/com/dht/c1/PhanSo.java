/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.c1;

/**
 *
 * @author admin
 */
public class PhanSo {

    private static int dem;
    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo() {
        this(0, 1);
    }

    private static int ucln(int a, int b) {
        if (a == 0 || b == 0) {
            return 1;
        }

        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        return a;
    }

    public PhanSo rutGon() {
        int u = ucln(this.tuSo, this.mauSo);

        return new PhanSo(this.tuSo / u, this.mauSo / u);
    }

    public PhanSo cong(PhanSo p) {
        int t = this.tuSo * p.mauSo + this.mauSo * p.tuSo;
        int m = this.mauSo * p.mauSo;
        
        PhanSo kq = new PhanSo(t, m);
        return kq.rutGon();
    }

    public int soSanh(PhanSo p) {
        // so sanh phan this va p
        // > 0 neu this > p
        // = 0 neu this = p
        // < 0 neu this < p
        double t1 = this.tuSo*1.0 / this.mauSo;
        double t2 = p.tuSo*1.0 / p.mauSo;

        return (t1 > t2) ? 1 : (t1 < t2 ? -1 : 0);
    }

    public void hienThi() {
        System.out.printf("%d/%d\t", this.tuSo, this.mauSo);
    }

    /**
     * @return the tuSo
     */
    public int getTuSo() {
        return tuSo;
    }

    /**
     * @param tuSo the tuSo to set
     */
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    /**
     * @return the mauSo
     */
    public int getMauSo() {
        return mauSo;
    }

    /**
     * @param mauSo the mauSo to set
     */
    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
}
