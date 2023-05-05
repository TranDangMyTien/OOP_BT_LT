/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.b07;

/**
 *
 * @author admin
 */
public class Circle extends Ellipse {
    public Circle(double bk) {
        super(bk, bk);
    }
    
    

//    @Override
//    public void hienThi() {
//        System.out.println("Hinh Circle");
//        System.out.printf("Dien tich: %.1f\nChu vi: %.1f\n", 
//                this.tinhDienTich(), this.tinhChuVi());
//    }

    @Override
    public String layTen() {
        return "Hinh Circle";
    }

}
