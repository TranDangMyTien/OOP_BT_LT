/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.javademoc1;

import com.dht.c5.Circle;
import com.dht.c5.Ellipse;
import com.dht.c5.Hinh;
import com.dht.c5.TamGiac;
import com.dht.c5.TamGiacCan;
import com.dht.c5.TamGiacDeu;
import java.util.Arrays;

/**
 *
 * @author PM08
 */
public class JavaDemoC5 {

    public static void main(String[] args) throws Exception {
        Ellipse h1 = new Ellipse(25, 20);
        Circle h2 = new Circle(22);
        Ellipse h3 = new Circle(24);
        TamGiac h4 = new TamGiac(30, 40, 50);
        TamGiac h5 = new TamGiacCan(35, 30);
        TamGiac h6 = new TamGiacDeu(34);

        Hinh[] a = {h1, h2, h3, h4, h5, h6};
        Arrays.sort(a, (h11, h22) -> {
            double d1 = h11.tinhDienTich();
            double d2 = h22.tinhDienTich();
            return (d1 > d2 ? 1 : (d1 < d2 ? -1 : 0));
        });
        for (Hinh h: a)
            h.hienThi();
    }
}
