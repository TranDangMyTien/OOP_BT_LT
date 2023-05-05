/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.democ2;

import java.util.stream.IntStream;

/**
 *
 * @author admin
 */
public class Bai05 {
    public static int[][] sinhMaTran(int m, int n) {
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = (int)(Math.random()*100 + 1);
        
        return a;
    }
    
    public static void xuatMaTran(int[][] a) {
        // C1
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.printf("%d\t", a[i][j]);
            System.out.println();
        }
        System.out.println("============");
        // C2
        for (int[] row: a) {
            for (int x: row)
                 System.out.printf("%d\t", x);
            System.out.println();
        }
            
    }
    
    public static void tongDong(int[][] a) {
        for (int i = 0; i < a.length; i++)
            System.out.printf("Tong dong thu %d la %d\n", i, 
                    IntStream.of(a[i]).sum());
    }
    
    public static void tongCot(int[][] a) {
//        for (int j = 0; j < a[0].length; j++) {
//            int tong = 0;
//            for (int i = 0; i < a.length; i++)
//                tong += a[i][j];
//            System.out.printf("Tong cot %d la %d\n", j, tong);
//        }

        for (int j = 0; j < a[0].length; j++) {
            int[] b = new int[a.length];
            for (int i = 0; i < a.length; i++)
                b[i] = a[i][j];
            System.out.printf("Tong cot %d la %d\n", j, IntStream.of(b).sum());
        }
    }
    
    public static int tongDongI(int[][] a, int dong) {
        return IntStream.of(a[dong]).sum();
    }
    
    public static int tongDongMax(int[][] a, int dong) {
        return IntStream.of(a[dong]).max().getAsInt();
    }
    
    public static void test(int... a) {
        System.out.println(IntStream.of(a).sum());
    }
    
    public static void main(String[] args) {
        int[][] a = sinhMaTran(4, 5);
        xuatMaTran(a);
        tongDong(a);
        tongCot(a);
        
        test(4, 5, 6, 2, 9, -1, 9);
    }
}
