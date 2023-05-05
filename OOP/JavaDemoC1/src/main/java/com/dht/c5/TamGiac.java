/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.c5;

/**
 *
 * @author PM08
 */
public class TamGiac extends Hinh {

    private double a, b, c;

    public TamGiac(double a, double b, double c) throws Exception {
        if (a + b > c && b + c > a && a + c > b) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new Exception();
        }
    }

    public double tinhDienTich() {
        double p = this.tinhChuVi() / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    public double tinhChuVi() {
        return this.a + this.b + this.c;
    }
    
    public String layTenHinh() {
        return "Tam giac thuong";
    }
    
    public void hienThi() {
        System.out.println(this.layTenHinh());
        System.out.printf("Dien tich: %.1f\nChu vi: %.1f\n",
                this.tinhDienTich(), this.tinhChuVi());
    }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) {
        this.c = c;
    }
}
