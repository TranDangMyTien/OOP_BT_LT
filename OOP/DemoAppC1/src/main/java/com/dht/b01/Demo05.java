/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.b01;

import java.util.stream.IntStream;

/**
 *
 * @author admin
 */
public class Demo05 {
    public static int[][] taoMaTran(int m, int n) {
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = (int) (Math.random()*100 + 1);
        
        return a;
    }
    
    public static void xuatMaTran(int[][] a) {
        // c1
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.printf("%d\t", a[i][j]);
            System.out.println();
        }
        System.out.println("===");
        
        // c2
        for (int[] row: a) {
            for (int x: row)
                System.out.printf("%d\t", x);
            System.out.println();
        }
    }
    
    public static void tongDong(int[][] a) {
        for (int i = 0; i < a.length; i++)
            System.out.printf("Tong dong thu %d la %d\n", i, IntStream.of(a[i]).sum());
    }
    
    public static void dongi(int[][] a, int i) {
        System.out.printf("Tong dong thu %d la %d\n", i, IntStream.of(a[i]).sum());
        System.out.printf("Nho nhat dong thu %d la %d\n", i, IntStream.of(a[i]).min().getAsInt());
    }
    
    public static void minDong(int[][] a) {
        for (int i = 0; i < a.length; i++)
            System.out.printf("Nho nhat dong thu %d la %d\n", i, IntStream.of(a[i]).min().getAsInt());
    }
    
    public static void cot(int[][] a) {
        for (int j = 0; j < a[0].length; j++) {
            int[] t = new int[a.length];
            for (int i = 0; i < a.length; i++)
                t[i] = a[i][j];
            
            System.out.printf("Tong cot thu %d la %d\n", j, IntStream.of(t).sum());
            System.out.printf("Nho nhat cot thu %d la %d\n", j, IntStream.of(t).min().getAsInt());
        }
    }
    
    public static void main(String[] args) {
        int[][] a = taoMaTran(4, 5);
        xuatMaTran(a);
        tongDong(a);
        minDong(a);
        cot(a);
    }
}
