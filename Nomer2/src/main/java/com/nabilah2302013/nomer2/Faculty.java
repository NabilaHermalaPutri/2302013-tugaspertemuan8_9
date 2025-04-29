/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nabilah2302013.nomer2;

/**
 *
 * @author Lenovo
 */
public class Faculty extends Employee {
    private String jamKerja;
    private String pangkat;

    public Faculty(String nama, String alamat, String noTelp, String email,
                   String kantor, double gaji, MyDate tanggal, String jamKerja, String pangkat) {
        super(nama, alamat, noTelp, email, kantor, gaji, tanggal);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return "Faculty: " + nama;
    }
}

