/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.b06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class QuanLySanPham {
    private List<SanPham> ds = new ArrayList<>();
    
    public void themSp(SanPham s) {
        this.ds.add(s);
    }
    
    public void hienThi() {
        this.ds.forEach(h -> h.hienThi());
    }
    
    public SanPham traCuu(int id) {
        return this.ds.stream().filter(s -> s.getId() == id).findFirst().get();
    }
    
    public List<SanPham> traCuu(String tuKhoa) {
        return this.ds.stream().filter(s -> s.getTenSp().contains(tuKhoa)).collect(Collectors.toList());
    }
    
    public List<SanPham> traCuu(double tuGia, double denGia) {
        return this.ds.stream().filter(s -> s.getGia() >= tuGia && s.getGia() <= denGia).collect(Collectors.toList());
    }
    
    public void sapXep() {
        this.ds.sort((s1, s2) -> {
            double g1 = s1.getGia();
            double g2 = s2.getGia();
            
            if (g1 > g2)
                return 1;
            else if (g1 < g2)
                return -1;
            return 0;
        });
    }

    /**
     * @return the ds
     */
    public List<SanPham> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }
}
