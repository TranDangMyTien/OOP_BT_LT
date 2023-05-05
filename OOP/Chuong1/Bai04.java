/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.democ2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author admin
 */
public class Bai04 {
    public static int[] nhapMang(int n) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }
        
        return a;
    }
    
    public static void xuatMang(int[] a) {
        IntStream.of(a).forEach(x -> System.out.printf("%d\t", x));
        
//        for (int x: a)
//            System.out.printf("%d\t", x);
        System.out.println();
    }
    
    public static boolean isNguyenTo(int n) {
        if (n >= 2) {
            for (int i = 2; i <= Math.sqrt(n); i++)
                if (n % i == 0)
                    return false;
            return true;
        }
        
        return false;
    }
    
    public static int minNt(int[] a) {
        return IntStream.of(a).filter(x -> isNguyenTo(x)).min().getAsInt();
    }
    
    public static int tongNt(int[] a) {
        return IntStream.of(a).filter(x -> isNguyenTo(x) == true).sum();
//        int tong = 0;
//        for (int x: a)
//            if (isNguyenTo(x) == true)
//                tong += x;
//        return tong;
    }
    
    public static int timNhiPhan(int[] a, int x) {
        Arrays.sort(a);
        return Arrays.binarySearch(a, x);
    }
    
    public static void maxmin(int[] a) {
        System.out.println(IntStream.of(a).filter(x -> x > 0).max().getAsInt());
        System.out.println(IntStream.of(a).filter(x -> x < 0).min().getAsInt());
//        int max = 0;
//        int min = 0;
//        
//        for (int x: a) {
//            if (x > max)
//                max = x;
//            else if (x < min)
//                min = x;
//        }
//        
//        if (max == 0)
//            System.out.println("Max: *");
//        else
//            System.out.println("Max: " + max);
//        
//        if (min == 0)
//            System.out.println("Min: *");
//        else
//            System.out.println("Min: " + min);
    }
    
    public static void main(String[] args) {
        int[] a = nhapMang(5);
        xuatMang(a);
        
        System.out.println("Tong nguyen to = " + tongNt(a));
        maxmin(a);
        
        System.out.println("Tim 9: " + timNhiPhan(a, 9));
        
//        int[] b = {5, 6, 9, 2, 1};
//        System.out.println(IntStream.of(b).sum());
//        System.out.println(IntStream.of(b).max().getAsInt());
//        System.out.println(IntStream.of(b).min().getAsInt());
//        System.out.println(IntStream.of(b).summaryStatistics());
    }
}
