/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.b01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author admin
 */
public class Demo04 {
    public static int[] nhapMang(int n) {
        Scanner s = new Scanner(System.in);
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = s.nextInt();
        }
        
        return a;
    }
    
    public static int timX(int[] a, int x) {
        Arrays.sort(a);
        return Arrays.binarySearch(a, x);
    }
    
    public static void xuatMang(int[] a) {
//        // C1
//        for (int i = 0; i < a.length; i++)
//            System.out.printf("%d\t", a[i]);
//        System.out.println();
//        
//        // C2
//        for (int x: a)
//            System.out.printf("%d\t", x);
//        System.out.println();
        
        IntStream.of(a).forEach(x -> System.out.printf("%d\t", x));
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
    
    public static void minmax(int a[]) {
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
    
    public static int ntNhoNhat(int[] a) {
        return IntStream.of(a).filter(x -> isNguyenTo(x)==true).min().getAsInt();
//        int m = Integer.MAX_VALUE;
//        for (int x: a)
//            if (isNguyenTo(x) == true && x < m) 
//                m = x;
//        return m;
    }
    
    public static void main(String[] args) {
        int[] a = nhapMang(6);
        xuatMang(a);
        
        int tong = 0;
        for (int x: a)
            if (isNguyenTo(x) == true)
                tong += x;
        System.out.println("Tong nguyen to = " + tong);
        
        minmax(a);
        
        int m = ntNhoNhat(a);
        System.out.println("So nguyen to nho nhat = " + m);
        
        System.out.println("Tim 9: " + timX(a, 9) );

//        int[] b = {4, 6, 7, 5, 9, 10, 1, 2};
//        System.out.println("Tong" + IntStream.of(b).sum());
//        System.out.println("Tong" + IntStream.of(b).max().getAsInt());
//        System.out.println("Tong" + IntStream.of(b).min().getAsInt());
//        System.out.println("Tong" + IntStream.of(b).average().getAsDouble());
//        System.out.println(IntStream.of(b).filter(x -> x%2==0).sum());
    }
}
