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
public class Bai01 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 100 + 1);

        Scanner sc = new Scanner(System.in);

        int x;
        do {
            System.out.print("Nhap so ban doan x = ");
            x = sc.nextByte();

            if (x < n) {
                System.out.println("So ban doan nho hon!!!");
            } else if (x > n) {
                System.out.println("So ban doan lon hon!!!");
            } else {
                System.out.println("CHINH XAC!!!");
            }
        } while (x != n);

    }
}
