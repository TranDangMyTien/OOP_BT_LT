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
public class Bai03 {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("s = ");
//        String s = sc.nextLine();
//        
//        System.out.println(s.substring(0, s.indexOf("@"))); 
//        int count = 0;
//        for (int i = 0; i < s.length(); i++)
//            if (Character.isUpperCase(s.charAt(i)) == true)
//                count++;
//        System.out.println(count);
        
//        File f = new File("src/main/resources/data.txt");
//        Scanner sf = new Scanner(f);
//        String m = sf.nextLine();
//        m = m.replaceAll("\\{file\\}", "TAP TIN");
//        sf.close();
//        
//        File f2 = new File("src/main/resources/out.txt");
//        PrintWriter w = new PrintWriter(f2);
//        w.println(m);
//        w.close();

        // d)
//        String s = "   java     is      simple   , java is ;,,;,;,;,;   gooddddddddd     ";
//        String[] a = s.trim().split("[\\s,;]+");
//        System.out.println(a.length);
//        
//        String m = a[0];
//        for (int i = 1; i < a.length; i++)
//            if (a[i].length() > m.length())
//                m = a[i];
//        System.out.println(m);
        
        // e)
        String s = " java    iS     sIMple   ";
        String[] a = s.trim().split("\\s+");
        
        String kq = "";
        for (String x: a)
            kq += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        System.out.println(kq);
    }
}
