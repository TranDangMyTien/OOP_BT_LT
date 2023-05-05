/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.b02;

/**
 *
 * @author admin
 */
public class Diem {
    private int hoanhDo;
    private int tungDo;

    public Diem(int hoanhDo, int tungDo) {
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }
    
    public void hienThi() {
        System.out.printf("(%d, %d)", hoanhDo, tungDo);
    }
    
    public double tinhKhoangCach(Diem p) {
        return Math.sqrt(Math.pow(hoanhDo - p.hoanhDo, 2) +
                Math.pow(tungDo - p.tungDo, 2));
    }

    /**
     * @return the hoanhDo
     */
    public int getHoanhDo() {
        return hoanhDo;
    }

    /**
     * @param hoanhDo the hoanhDo to set
     */
    public void setHoanhDo(int hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    /**
     * @return the tungDo
     */
    public int getTungDo() {
        return tungDo;
    }

    /**
     * @param tungDo the tungDo to set
     */
    public void setTungDo(int tungDo) {
        this.tungDo = tungDo;
    }
    
    
}
