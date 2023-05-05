/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.b08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class QuanLyTaiKhoan {
    private List<TaiKhoan> ds = new ArrayList<>();
    
    public void themTk(TaiKhoan t) {
        this.ds.add(t);
    }
    
    public void themTk(TaiKhoan... a) {
        this.ds.addAll(Arrays.asList(a));
    }
    
    public List<TaiKhoan> traCuu(String kw) {
        return this.ds.stream().filter(t -> t.getTenTk().contains(kw)).collect(Collectors.toList());
    }

    /**
     * @return the ds
     */
    public List<TaiKhoan> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<TaiKhoan> ds) {
        this.ds = ds;
    }
}
