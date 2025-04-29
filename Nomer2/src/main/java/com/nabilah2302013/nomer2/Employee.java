/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nabilah2302013.nomer2;

/**
 *
 * @author Lenovo
 */
public class Employee extends Person {
    protected String kantor;
    protected double gaji;
    protected MyDate tanggalDipekerjakan;

    public Employee(String nama, String alamat, String noTelp, String email,
                    String kantor, double gaji, MyDate tanggal) {
        super(nama, alamat, noTelp, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalDipekerjakan = tanggal;
    }

    @Override
    public String toString() {
        return "Employee: " + nama;
    }
}

