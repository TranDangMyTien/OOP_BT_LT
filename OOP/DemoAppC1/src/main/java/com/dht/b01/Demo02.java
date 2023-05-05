/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.b01;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap n = ");
        int n = sc.nextByte();
        System.out.print("Nhap x = ");
        double x = sc.nextDouble();
        
        double gt = 0;
        for (int i = 0; i <= n; i++) {
            System.out.printf("Nhap so thu %d = ", i);
            double a = sc.nextByte();
            gt += a * Math.pow(x, i);
        }  
        
        System.out.printf("Gia tri da thuc = %.2f\n", gt);
    }
}
