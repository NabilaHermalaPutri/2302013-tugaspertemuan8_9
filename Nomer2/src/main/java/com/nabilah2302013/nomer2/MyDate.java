/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nabilah2302013.nomer2;

/**
 *
 * @author Lenovo
 */
public class MyDate {
    private int hari;
    private int bulan;
    private int tahun;

    public MyDate(int hari, int bulan, int tahun) {
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    @Override
    public String toString() {
        return hari + "/" + bulan + "/" + tahun;
    }
}

