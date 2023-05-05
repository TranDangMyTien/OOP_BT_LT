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
public class Demo01 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 100 + 1);

        Scanner sc = new Scanner(System.in);

        int doan;
        do {
            System.out.print("Nhap so ban doan = ");
            doan = sc.nextByte();

            if (doan > n) {
                System.out.println("SO BAN DOAN LON HON!!!");
            } else if (doan < n) {
                System.out.println("SO BAN DOAN NHO HON!!!");
            } else {
                System.out.println("CHINH XAC!!!");
            }
        } while (doan != n);
    }
}
