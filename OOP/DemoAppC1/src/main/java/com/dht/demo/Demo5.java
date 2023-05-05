/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.demo;

import com.dht.b06.Circle;
import com.dht.b06.Ellipse;
import com.dht.b06.Hinh;
import com.dht.b06.TamGiac;
import com.dht.b06.TamGiacCan;
import com.dht.b06.TamGiacDeu;
import java.util.Arrays;

/**
 *
 * @author admin
 */
public class Demo5 {
    public static void main(String[] args) throws Exception {
        Ellipse h1 = new Ellipse(40, 37);
        Circle h2 = new Circle(35);
        Ellipse h3 = new Circle(38);
        TamGiac h4 = new TamGiac(40, 50, 60);
        TamGiac h5 = new TamGiacCan(55, 40);
        TamGiac h6 = new TamGiacDeu(55);
        
        Hinh[] a = {h1, h2, h3, h4, h5, h6};
        
        
        Arrays.sort(a, (h11, h22) -> {
            double d1 = h11.tinhDienTich();
            double d2 = h22.tinhDienTich();
            
            if (d1 > d2)
                return 1;
            else if (d1 < d2)
                return -1;
            return 0;
        });
        
        for (Hinh x: a)
            x.hienThi();
        
//        h1.hienThi();
//        h2.hienThi();
//        h3.hienThi();
//        h4.hienThi();
//        h5.hienThi();
//        h6.hienThi();
    }
}
