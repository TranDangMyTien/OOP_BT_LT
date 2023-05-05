/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.b01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Demo03 {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap chuoi = ");
//        String s = sc.nextLine();
//       
//        System.out.println(s.substring(0, s.indexOf("@")));
//        
//        int count = 0;
//        for (int i = 0; i < s.length(); i++)
//            if (Character.isUpperCase(s.charAt(i)) == true)
//                count++;
//        
//        System.out.printf("So ky tu hoa = %d\n", count);
//        
//        File f = new File("src/main/resources/data.txt");
//        Scanner sf = new Scanner(f);
//        String t = sf.nextLine();
//        t = t.replaceAll("\\{file\\}", "TAP TIN");
//        sf.close();
//        
//        
//        File fo = new File("src/main/resources/out.txt");
//        PrintWriter w = new PrintWriter(fo);
//        w.println(t);
//        w.close();
        String s = "   java     is ;  simple  , ;,    java    is     greatttttttttttttttttt    ";
        String[] a = s.trim().split("[\\s,;]+");
        System.out.println("So tu = " + a.length);
        
        String max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i].length() > max.length())
                max = a[i];
        
        System.out.println("Tu dai nhat = " + max);
        
        String s2 = "   java     iS   simpLE     java    is     gReat    ";
        String[] a2 = s2.trim().split("\\s+");
        String kq = "";
        for (String x: a2)
            kq += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        System.out.println(kq);
    }
}
