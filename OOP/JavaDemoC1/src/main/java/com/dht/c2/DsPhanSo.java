/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.c2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class DsPhanSo {
    private static final Scanner sc = new Scanner(System.in);
    private ArrayList<PhanSo> ds = new ArrayList<>();
    
    /**
     * Them phan so da co san
     * @param p phan so can them
     */
    public void themPhanSo(PhanSo p) {
        this.ds.add(p);
    }
    
    /**
     * Them phan so can nhap vao
     */
    public void themPhanSo() {
        System.out.print("Tu so = ");
        int t = sc.nextInt();
        System.out.print("Mau so = ");
        int m = sc.nextInt();
        
        this.ds.add(new PhanSo(t, m));
    }
    
    public void xoaPhanSo(PhanSo p) {
        this.ds.remove(p);
    }
    
    public void xoaPhanSo(int t, int m) {
        PhanSo r = new PhanSo(t, m);
//        for (PhanSo p: this.ds)
//            if (p.soSanh(r) == 0) {
//                this.ds.remove(p);
//                break;
//            }
        
        PhanSo q = this.ds.stream().filter(p -> p.soSanh(r) == 0).findFirst().get();
        this.ds.remove(q);
    }
    
    public PhanSo tong() {
        return this.ds.stream().reduce(new PhanSo(), (t, p) -> t.cong(p));
//        PhanSo t = new PhanSo();
//        
//        for (PhanSo p: this.ds)
//            t = t.cong(p);
//        
//        return t.rutGon();
    }
    
    public void sapXep() {
        this.ds.sort((p, q) -> p.soSanh(q));
    }
    
    public PhanSo timMax() {
        return this.ds.stream().max((p, q) -> p.soSanh(q)).get();
    }
    
    public void hienThi() {
        this.ds.forEach(p -> p.hienThi());
//        for (PhanSo p: this.ds)
//            p.hienThi();
        System.out.println();
    }

    /**
     * @return the ds
     */
    public ArrayList<PhanSo> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(ArrayList<PhanSo> ds) {
        this.ds = ds;
    }
}
