/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.javademoc1;

import com.dht.c6.Circle;
import com.dht.c6.Ellipse;
import com.dht.c6.Hinh;
import com.dht.c6.TamGiac;
import com.dht.c6.TamGiacCan;
import com.dht.c6.TamGiacDeu;
import java.util.Arrays;

/**
 *
 * @author PM08
 */
public class JavaDemoC7 {

    public static void main(String[] args) throws Exception {
        Ellipse h1 = new Ellipse(40, 35);
        Circle h2 = new Circle(38);
        Ellipse h3 = new Circle(42);
        TamGiac h4 = new TamGiac(50, 60, 70);
        TamGiac h5 = new TamGiacCan(66, 50);
        TamGiac h6 = new TamGiacDeu(70);

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
