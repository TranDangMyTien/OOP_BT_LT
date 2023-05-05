/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.c1;

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
     * Them phan so co san
     * @param p phan so can them
     */
    public void themPhanSo(PhanSo p) {
        this.ds.add(p);
    }
    
    /**
     * Nhap phan so can them
     */
    public void themPhanSo() {
        System.out.print("Nhap tu so = ");
        int t = sc.nextInt();
                
        System.out.print("Nhap mau so = ");
        int m = sc.nextInt();
        
        PhanSo p = new PhanSo(t, m);
        this.ds.add(p);
    }
    
    public void xoaPhanSo(PhanSo p) {
        this.ds.remove(p);
    }
    
    public void xoaPhanSo(int t, int m) {
        PhanSo q = new PhanSo(t, m);
        
        PhanSo r = this.ds.stream().filter(p -> p.soSanh(q) == 0).findFirst().get();
        this.ds.remove(r);
        
//        for (PhanSo p: this.ds)
//            if (p.soSanh(q) == 0) {
//                this.ds.remove(p);
//                break;
//            }
    }
    
    public PhanSo tong() {
        PhanSo t = new PhanSo();
        
        return this.ds.stream().reduce(t, (p, q) -> p.cong(q));
        
//        for (PhanSo p: this.ds)
//            t = t.cong(p);
//        
//        return t.rutGon();
    }
    
    public PhanSo timMax() {
        return this.ds.stream().max((p, q) -> p.soSanh(q)).get();
    }
    
    public PhanSo timMin() {
        
        return this.ds.stream().min((p, q) -> p.soSanh(q)).get();
    }
    
    public void sapXep() {
        this.ds.sort((p, q) -> p.soSanh(q));
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
