/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nabilah2302013.nomer2;

/**
 *
 * @author Lenovo
 */
public class Staff extends Employee {
    private String gelar;

    public Staff(String nama, String alamat, String noTelp, String email,
                 String kantor, double gaji, MyDate tanggal, String gelar) {
        super(nama, alamat, noTelp, email, kantor, gaji, tanggal);
        this.gelar = gelar;
    }

    @Override
    public String toString() {
        return "Staff: " + nama;
    }
}

