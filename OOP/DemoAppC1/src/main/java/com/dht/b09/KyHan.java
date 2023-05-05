/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.dht.b09;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author admin
 */
public enum KyHan {
    MOT_TUAN {
        @Override
        public Calendar tinhDaoHan() {
            Calendar c = new GregorianCalendar();
            c.add(Calendar.DAY_OF_YEAR, 7);
            return c;
        }

        @Override
        public double tinhLai(double st) {
            return (st * 0.5)/(100*12*4);
        }
    },
    MOT_THANG {
        @Override
        public Calendar tinhDaoHan() {
            Calendar c = new GregorianCalendar();
            c.add(Calendar.MONTH, 1);
            return c;
        }

        @Override
        public double tinhLai(double st) {
            return (st * 4.5)/(100*12);
        }
        
    },
    MOT_NAM {
        @Override
        public Calendar tinhDaoHan() {
            Calendar c = new GregorianCalendar();
            c.add(Calendar.YEAR, 1);
            return c;
        }

        @Override
        public double tinhLai(double st) {
            return (6.8*st)/100;
        }
    };
    
    public Calendar tinhDaoHan() {
        return null;
    }
    public double tinhLai(double st) {
        return 0;
    }
}
